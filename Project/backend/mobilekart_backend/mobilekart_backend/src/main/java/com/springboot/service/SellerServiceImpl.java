package com.springboot.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.dto.SellerRequestDTO;
import com.springboot.dto.SellerResponseDTO;
import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.entity.Seller;
import com.springboot.entity.User;
import com.springboot.repository.AdminRepository;
import com.springboot.repository.SellerRepository;
import com.springboot.repository.UserRepository;

import jakarta.transaction.Transactional;
@Service 
@Transactional
public class SellerServiceImpl implements SellerService{
	private AdminRepository adminRepository;
	private SellerRepository sellerRepository;
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	public SellerServiceImpl(AdminRepository adminRepository,SellerRepository sellerRepository,UserRepository userRepository,PasswordEncoder passwordEncoder) {
		this.adminRepository=adminRepository;
		this.sellerRepository=sellerRepository;
		this.userRepository=userRepository;
		this.passwordEncoder=passwordEncoder;
	}
	
	@Override
	public SellerResponseDTO sellerRegistration(SellerRequestDTO request) {
		String email = request.getEmail();
		if(adminRepository.existsByEmail(email)||
				sellerRepository.existsByEmail(email)||
					userRepository.existsByEmail(email)) {
			throw new RuntimeException("User Already Exist");
		}
		
		Seller seller = new Seller();
		seller.setShopname(request.getShopname());
		seller.setEmail(request.getEmail());
		seller.setPassword(passwordEncoder.encode(request.getPassword()));
		seller.setContact(request.getContact());
		seller.setGstno(request.getGstno());
		seller.setPanno(request.getPanno());
		seller.setAddress(request.getAddress());
		seller.setAccountno(request.getAccountno());
		
		Seller sellerObj = sellerRepository.save(seller);
		
		SellerResponseDTO sellerResponseDto = new SellerResponseDTO();
		sellerResponseDto.setSellerid(sellerObj.getSellerid());
		sellerResponseDto.setShopname(sellerObj.getShopname());
		sellerResponseDto.setEmail(sellerObj.getEmail());
		sellerResponseDto.setContact(sellerObj.getContact());
		sellerResponseDto.setGstno(sellerObj.getGstno());
		sellerResponseDto.setPanno(sellerObj.getPanno());
		sellerResponseDto.setAddress(sellerObj.getAddress());
		sellerResponseDto.setAccountno(sellerObj.getAccountno());
		sellerResponseDto.setSellerstatus(sellerObj.getSellerstatus());
		sellerResponseDto.setEmailverify(sellerObj.getEmailVerify());
		sellerResponseDto.setAdminverify(sellerObj.getAdminVerify());
		sellerResponseDto.setCreatedat(sellerObj.getCreatedat());
		sellerResponseDto.setUpdatedat(sellerObj.getUpdatedat());
		
		return sellerResponseDto;
	}
}
