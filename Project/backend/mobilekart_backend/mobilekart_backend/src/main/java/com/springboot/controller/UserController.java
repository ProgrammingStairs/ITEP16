package com.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.CartRequestDTO;
import com.springboot.dto.MobileResponseDTO;
import com.springboot.dto.MobileVariantResponseDTO;
import com.springboot.dto.OrderItemsResponseDTO;
import com.springboot.dto.OrderRequestDTO;
import com.springboot.dto.OrderResponseDTO;
import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.entity.Cart;
import com.springboot.entity.Mobile;
import com.springboot.entity.MobileVariant;
import com.springboot.entity.Orders;
import com.springboot.entity.Seller;
import com.springboot.entity.User;
import com.springboot.repository.CartRepository;
import com.springboot.repository.MobileRepository;
import com.springboot.repository.MobileVariantRepository;
import com.springboot.repository.OrderRepository;
import com.springboot.repository.UserRepository;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	private MobileRepository mobileRepository;
	private OrderRepository orderRepository;
	private UserRepository userRepository;
	private CartRepository cartRepository;
	private MobileVariantRepository mobileVariantRepository;
	public UserController(UserService userService,MobileRepository mobileRepository,UserRepository userRepository,CartRepository cartRepository,MobileVariantRepository mobileVariantRepository,OrderRepository orderRepository) {
		this.userService = userService;
		this.mobileRepository = mobileRepository;
		this.userRepository = userRepository;
		this.cartRepository = cartRepository;
		this.mobileVariantRepository = mobileVariantRepository;
		this.orderRepository = orderRepository;
	}
	@PostMapping("/registration")
	public ResponseEntity<Map<String,Object>> userRegistration(@RequestBody UserRequestDTO request){
		UserResponseDTO response = userService.userRegistration(request);
		return ResponseEntity.status(HttpStatus.OK).body(
				Map.of(
						"message","User Registration Successfull",
						"userDto", response,
						"status",200
				)
		);
	}
	
	@GetMapping("/userViewMobileList")
	public ResponseEntity<List<MobileResponseDTO>> viewMobile(){
		List<Mobile> list = mobileRepository.findAll();
		List<MobileResponseDTO> mobileResponse = list.stream().map((mobile)->{
			MobileResponseDTO responseDTO = new MobileResponseDTO();
			responseDTO.setMobileid(mobile.getMobileid());
			responseDTO.setSellerid(mobile.getSellerid());
			responseDTO.setBrand(mobile.getBrand());
			responseDTO.setModelname(mobile.getModelname());
			responseDTO.setDescription(mobile.getDescription());
			responseDTO.setCreatedat(mobile.getCreatedat());
			responseDTO.setUpdatedat(mobile.getUpdatedat());
			
			List<MobileVariantResponseDTO> vdto = mobile.getVariants().stream().map((mobileVariant)->{
				MobileVariantResponseDTO resDto = new MobileVariantResponseDTO(mobileVariant);
				return resDto;
			}).toList();
			responseDTO.setVariants(vdto);
			return responseDTO;
			
		}).toList();
		return ResponseEntity.ok(mobileResponse);
	}

	@PostMapping("/addToCart")
	public ResponseEntity<Map<String,Object>> addToCart(@RequestBody CartRequestDTO request,Authentication authentication){
		String email = authentication.getName();
		User userObj = userRepository.findByEmail(email)
				.orElseThrow(()-> new RuntimeException("User Not Found"));
		Cart cartObj =  cartRepository.findByVariantid(request.getVariantid());
		System.out.print("--------------> "+request.getVariantid());
		MobileVariant mobileObj =  mobileVariantRepository.findById(request.getVariantid())
				.orElseThrow(()-> new RuntimeException("Mobile Variant Not Found"));
		int stock = mobileObj.getStock();
		Cart cartObject = null;
		if(cartObj!=null) {
			if(cartObj.getQuantity()+request.getQuantity()>=stock)
				cartObj.setQuantity(stock);
			else if(cartObj.getQuantity()+request.getQuantity()<stock)
				cartObj.setQuantity(cartObj.getQuantity()+request.getQuantity());
			cartObject = cartRepository.save(cartObj);
		}else {
			Cart cobj = new Cart();
			cobj.setPrice(request.getPrice());
			cobj.setQuantity(request.getQuantity());
			cobj.setVariantid(request.getVariantid());
			cobj.setUserid(userObj.getUserid());
			
			cartObject = cartRepository.save(cobj);
		}
		
	return ResponseEntity.status(HttpStatus.OK).body(
			Map.of(
					"message","Mobile Added To Cart Successfully",
					"cartObject",cartObject,
					"status", 200
			)
	);	
	}

	@PostMapping("/placeOrder")
	public ResponseEntity<Map<String,Object>> placeOrder(@RequestBody OrderRequestDTO request,Authentication authentication) {
		String email = authentication.getName();
		User userObj = userRepository.findByEmail(email)
						.orElseThrow(()-> new RuntimeException("User Not Found"));
		request.setUserid(userObj.getUserid());
		return ResponseEntity.status(HttpStatus.OK).body(
				Map.of(
					"message", userService.placeOrder(request),
					"status",200
				)
		);
	}
	
	@GetMapping("/placeOrderList")
	public ResponseEntity<List<OrderResponseDTO>> placeOrderList(Authentication authentication){
		String email = authentication.getName();
		User userObj = userRepository.findByEmail(email)
				.orElseThrow(()-> new RuntimeException("User Not Found"));
		
		List<Orders> list = orderRepository.findByUserid(userObj.getUserid());
		List<OrderResponseDTO> orderResponse = list.stream().map((order)->{
			OrderResponseDTO responseDTO = new OrderResponseDTO();
			responseDTO.setOrderid(order.getOrderid());
			responseDTO.setTotalamount(order.getTotalamount());
			responseDTO.setOrderstatus("Ordered");
			responseDTO.setPaymentstatus("Pending");
			responseDTO.setPaymentmethod("COD");
			responseDTO.setAddress(order.getAddress());
			responseDTO.setCity(order.getCity());
			responseDTO.setState(order.getState());
			responseDTO.setPincode(order.getPincode());
			
			List<OrderItemsResponseDTO> odto = order.getOrderitems().stream().map((orderItems)->{
				OrderItemsResponseDTO resDto = new OrderItemsResponseDTO(orderItems);
				return resDto;
			}).toList();
			responseDTO.setOrderitems(odto);
			return responseDTO;
			
		}).toList();
		return ResponseEntity.ok(orderResponse);
	}

}








