package com.springboot.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.entity.User;
import com.springboot.repository.AdminRepository;
import com.springboot.repository.SellerRepository;
import com.springboot.repository.UserRepository;

import jakarta.transaction.Transactional;
@Service 
@Transactional
public class UserServiceImpl implements UserService{
	private AdminRepository adminRepository;
	private SellerRepository sellerRepository;
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	public UserServiceImpl(AdminRepository adminRepository,SellerRepository sellerRepository,UserRepository userRepository,PasswordEncoder passwordEncoder) {
		this.adminRepository=adminRepository;
		this.sellerRepository=sellerRepository;
		this.userRepository=userRepository;
		this.passwordEncoder=passwordEncoder;
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
}
