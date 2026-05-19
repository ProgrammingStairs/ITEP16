package com.springboot.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.dto.OrderRequestDTO;
import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.entity.Cart;
import com.springboot.entity.MobileVariant;
import com.springboot.entity.OrderItems;
import com.springboot.entity.Orders;
import com.springboot.entity.User;
import com.springboot.repository.AdminRepository;
import com.springboot.repository.CartRepository;
import com.springboot.repository.MobileVariantRepository;
import com.springboot.repository.OrderRepository;
import com.springboot.repository.SellerRepository;
import com.springboot.repository.UserRepository;

import jakarta.transaction.Transactional;
@Service 
@Transactional
public class UserServiceImpl implements UserService{
	private AdminRepository adminRepository;
	private CartRepository cartRepository;
	private MobileVariantRepository mobileVariantRepository;
	private SellerRepository sellerRepository;
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	private OrderRepository orderRepository;
	
	public UserServiceImpl(AdminRepository adminRepository,SellerRepository sellerRepository,UserRepository userRepository,PasswordEncoder passwordEncoder,OrderRepository orderRepository,CartRepository cartRepository,MobileVariantRepository mobileVariantRepository) {
		this.adminRepository=adminRepository;
		this.sellerRepository=sellerRepository;
		this.userRepository=userRepository;
		this.passwordEncoder=passwordEncoder;
		this.orderRepository = orderRepository;
		this.cartRepository = cartRepository;
		this.mobileVariantRepository = mobileVariantRepository;
	}
	
	@Override
	public UserResponseDTO userRegistration(UserRequestDTO request) {
		String email = request.getEmail();
		if(adminRepository.existsByEmail(email)||
				sellerRepository.existsByEmail(email)||
					userRepository.existsByEmail(email)) {
			throw new RuntimeException("User Already Exist");
		}
		
		User user = new User();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setContact(request.getContact());
		user.setGender(request.getGender());
		
		User userObj = userRepository.save(user);
		
		UserResponseDTO userResponseDto = new UserResponseDTO();
		userResponseDto.setUserid(userObj.getUserid());
		userResponseDto.setName(userObj.getName());
		userResponseDto.setEmail(userObj.getEmail());
		userResponseDto.setContact(userObj.getContact());
		userResponseDto.setGender(userObj.getGender());
		userResponseDto.setCreatedat(userObj.getCreatedat());
		userResponseDto.setUpdatedat(userObj.getUpdatedat());
		
		return userResponseDto;
	}
	
	@Override
	public String placeOrder(OrderRequestDTO request) {
		List<Cart> cartItems =  cartRepository.findByUserid(request.getUserid());
		double totalAmount=0;
		for(Cart cart : cartItems) {
			totalAmount += cart.getQuantity()*cart.getPrice();
		}
		
		Orders order = new Orders();
		order.setUserid(request.getUserid());
		order.setTotalamount(totalAmount);
		order.setAddress(request.getAddress());
		order.setState(request.getState());
		order.setCity(request.getCity());
		order.setPincode(request.getPincode());

		for(Cart item : cartItems) {
			MobileVariant variantObj =  mobileVariantRepository.findById(item.getVariantid())
				.orElseThrow(()-> new RuntimeException("Variant Id Not Found"));
			variantObj.setStock(variantObj.getStock()-item.getQuantity());
			mobileVariantRepository.save(variantObj);
			
			OrderItems orderItems = new OrderItems();
			orderItems.setVariantid(item.getVariantid());
			orderItems.setQuantity(item.getQuantity());
			orderItems.setPrice(item.getPrice());
			orderItems.setTotalprice(item.getQuantity()*item.getPrice());
			
			order.addOrderItems(orderItems);
		}		
		orderRepository.save(order);
		cartRepository.deleteByUserid(request.getUserid());
		return "Order Placed Successfully";
	}
}
