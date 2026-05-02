package com.springboot.controller;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.SellerRequestDTO;
import com.springboot.dto.SellerResponseDTO;
import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.entity.Seller;
import com.springboot.entity.ValidateToken;
import com.springboot.repository.SellerRepository;
import com.springboot.service.MailService;
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
	public SellerController(SellerService sellerService,ValidateTokenService validateTokenService,MailService mailService,SellerRepository sellerRepository) {
		this.sellerService = sellerService;
		this.validateTokenService=validateTokenService;
		this.mailService = mailService;
		this.sellerRepository=sellerRepository;
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
}
