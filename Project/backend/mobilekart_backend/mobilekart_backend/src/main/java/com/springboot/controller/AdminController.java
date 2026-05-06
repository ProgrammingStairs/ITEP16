package com.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.SellerRequestDTO;
import com.springboot.dto.SellerResponseDTO;
import com.springboot.entity.Seller;
import com.springboot.repository.SellerRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	private SellerRepository sellerRepository;
	public AdminController(SellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
	}
	@GetMapping("/adminSellerList")
	public ResponseEntity<List<SellerResponseDTO>> sellerList(){
		List<Seller> sellerList = sellerRepository.findAll();
		List<SellerResponseDTO> response = sellerList.stream()
				.map(s-> new SellerResponseDTO(
						s.getSellerid(),
						s.getShopname(),
						s.getEmail(),
						s.getContact(),
						s.getGstno(),
						s.getPanno(),
						s.getAddress(),
						s.getAccountno(),
						s.getSellerstatus(),
						s.getEmailVerify(),
						s.getAdminVerify(),
						s.getCreatedat(),
						s.getUpdatedat()						
				)).toList();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	@PostMapping("/adminVerifySeller")
	public ResponseEntity<Map<String, Object>> adminVerifySeller(@RequestBody SellerRequestDTO request){
		Map<String,Object> response = new HashMap<String, Object>();
		
		Seller seller = sellerRepository.findByEmail(request.getEmail())
		.orElseThrow(()-> new RuntimeException("Seller Not Found"));
		
		seller.setAdminVerify("Verified");
		sellerRepository.save(seller);
		
		response.put("message", "Admin Verify Seller");
		response.put("status", 200);
		
		return ResponseEntity.ok(response);
	}
}








