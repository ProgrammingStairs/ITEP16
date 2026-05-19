package com.springboot.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.dto.MobileRequestDTO;
import com.springboot.dto.MobileResponseDTO;
import com.springboot.dto.MobileVariantRequestDTO;
import com.springboot.dto.MobileVariantResponseDTO;
import com.springboot.dto.SellerRequestDTO;
import com.springboot.dto.SellerResponseDTO;
import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.entity.Mobile;
import com.springboot.entity.MobileVariant;
import com.springboot.entity.Seller;
import com.springboot.entity.ValidateToken;
import com.springboot.repository.MobileRepository;
import com.springboot.repository.SellerRepository;
import com.springboot.service.MailService;
import com.springboot.service.MobileService;
import com.springboot.service.SellerService;
import com.springboot.service.ValidateTokenService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/seller")
public class SellerController {
	private ValidateTokenService validateTokenService;
	private MailService mailService;
	private SellerService sellerService;
	private SellerRepository sellerRepository;
	private MobileService mobileService;
	private MobileRepository mobileRepository;
	private Environment env;
	public SellerController(SellerService sellerService,ValidateTokenService validateTokenService,MailService mailService,SellerRepository sellerRepository,MobileService mobileService,MobileRepository mobileRepository,Environment env) {
		this.sellerService = sellerService;
		this.validateTokenService=validateTokenService;
		this.mailService = mailService;
		this.sellerRepository=sellerRepository;
		this.mobileService=mobileService;
		this.mobileRepository=mobileRepository;
		this.env=env;
	}
	
	@PostMapping("/registration")
	public ResponseEntity<Map<String,Object>> sellerRegistration(@RequestBody SellerRequestDTO request,HttpServletRequest rst){
		SellerResponseDTO response = sellerService.sellerRegistration(request);
		String token = validateTokenService.createValidationToken(request.getEmail());
		String link = "http://localhost:8080"+rst.getRequestURI().replace("registration", "verifyToken?token="+token);
		
		mailService.sendMail(request.getEmail(), "Verification Mail", "Hello "+request.getEmail()+", This is verification mail and you needs to verify yourself by clicking on the link given in the mail."+link);
		
		return ResponseEntity.status(HttpStatus.OK).body(
				Map.of(
						"message","Email Sent | Needs to Verify And Wait for Admin Approval",
						"sellerDto", response,
						"status",200
				)
		);
	}
	
	@GetMapping("/verifyToken")
	public void verifyMail(@RequestParam("token") String token,HttpServletResponse response) throws IOException{
		ValidateToken vt = validateTokenService.findByToken(token);
		if(vt==null) {
			response.sendRedirect("http://localhost:3000/login?message=Invalid_Token");
		}
		Optional<Seller> seller =  sellerRepository.findByEmail(vt.getEmail());
		if(!seller.isPresent()) {
			response.sendRedirect("http://localhost:3000/login?message=Seller_Not_Found");
		}
		Seller sellerObj = seller.get();
		sellerObj.setEmailVerify("Verified");
		sellerRepository.save(sellerObj);
		
		response.sendRedirect("http://localhost:3000/login?message=Wait_for_admin_approval");		
	}
	
	@PostMapping("/addMobile")
	public ResponseEntity<Map<String,Object>> addMobile(@RequestBody MobileRequestDTO request,Authentication authentication){
		String email = authentication.getName();
		Seller seller =  sellerRepository.findByEmail(email)
			.orElseThrow(()->new RuntimeException("Seller Not Found"));
		request.setSellerid(seller.getSellerid());
		MobileResponseDTO response = mobileService.addMobile(request);
		return ResponseEntity.status(HttpStatus.OK).body(
				Map.of(
						"message","Mobile Added Successfully",
						"mobileDto", response,
						"status",200
				)
		);
	}
	@GetMapping("/sellerMobileList")
	public ResponseEntity<List<MobileResponseDTO>> mobileList(){
		List<Mobile> mobileList = mobileRepository.findAll();
		List<MobileResponseDTO> response = mobileList.stream()
				.map(s-> new MobileResponseDTO(
						s.getMobileid(),
						s.getSellerid(),
						s.getBrand(),
						s.getModelname(),
						s.getDescription(),
						s.getCreatedat(),
						s.getUpdatedat()						
				)).toList();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	@PostMapping("/addMobileVariant")
	public ResponseEntity<Map<String, Object>> addMobileVariant(@ModelAttribute MobileVariantRequestDTO request) throws IOException{
		MultipartFile file = request.getImagename();
		String filePath =  env.getProperty("upload.filePath");
		File uploads = new File(filePath);
		if(!uploads.exists()) {
			uploads.mkdir();
			System.out.println("Folder created successfully");
		}
		String fileName = System.currentTimeMillis()+file.getOriginalFilename();
		File destination = new File(filePath,fileName);
		file.transferTo(destination);
		
		MobileVariant mobileVariant = new MobileVariant();
		mobileVariant.setPrice(request.getPrice());
		mobileVariant.setDiscountprice(request.getDiscountprice());
		mobileVariant.setStock(request.getStock());
		mobileVariant.setSku(request.getSku());
		mobileVariant.setColor(request.getColor());
		mobileVariant.setRam(request.getRam());
		mobileVariant.setStorage(request.getStorage());
		mobileVariant.setProcessor(request.getProcessor());
		mobileVariant.setDisplaysize(request.getDisplaysize());
		mobileVariant.setDisplaytype(request.getDisplaytype());
		mobileVariant.setBattery(request.getBattery());
		mobileVariant.setOperatingsystem(request.getOperatingsystem());
		mobileVariant.setRearcamera(request.getRearcamera());
		mobileVariant.setFrontcamera(request.getFrontcamera());
		mobileVariant.setNetwork(request.getNetwork());
		mobileVariant.setSimtype(request.getSimtype());
		mobileVariant.setWeight(request.getWeight());
		mobileVariant.setSellerid(request.getSellerid());
		mobileVariant.setImagename(fileName);
		
		Mobile mobile = mobileRepository.findById(request.getMobileid())
			.orElseThrow(()-> new RuntimeException("Mobile Not Found"));
		mobile.addVariant(mobileVariant);
		
		mobileRepository.save(mobile);
		
		return ResponseEntity.status(HttpStatus.OK).body(
				Map.of(
					"message","Mobile Variant Added Successfully",
					"status",200
				)
		);
	}
	
	@GetMapping("/sellerViewMobileList")
	public ResponseEntity<List<MobileResponseDTO>> viewMobile(Authentication authentication){
		String email = authentication.getName();
		Seller seller =  sellerRepository.findByEmail(email)
				.orElseThrow(()->new RuntimeException("Seller Not Found"));
			
		List<Mobile> list = mobileRepository.findBySellerid(seller.getSellerid());
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
	
}














