package com.springboot.service;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.entity.Admin;
import com.springboot.entity.Seller;
import com.springboot.entity.User;
import com.springboot.repository.AdminRepository;
import com.springboot.repository.SellerRepository;
import com.springboot.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	private AdminRepository adminRepository;
	private SellerRepository sellerRepository;
	private UserRepository userRepository;
	public CustomUserDetailsService(AdminRepository adminRepository,SellerRepository sellerRepository,UserRepository userRepository) {
		this.adminRepository = adminRepository;
		this.sellerRepository = sellerRepository;
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
	
		Admin admin = adminRepository.findByEmail(email).orElse(null);
		if(admin!=null) {
			return new org.springframework.security.core.userdetails.User(
						admin.getEmail(),
						admin.getPassword(),
						List.of(new SimpleGrantedAuthority("ROLE_ADMIN"))
					);
		}
		User user = userRepository.findByEmail(email).orElse(null);
		if(user!=null) {
			return new org.springframework.security.core.userdetails.User(
						user.getEmail(),
						user.getPassword(),
						List.of(new SimpleGrantedAuthority("ROLE_USER"))
					);
		}
		Seller seller = sellerRepository.findByEmail(email).orElse(null);
		if(seller!=null) {
			if("Not Verified".equals(seller.getEmailVerify()) || "Not Verified".equals(seller.getAdminVerify())) {
				throw new UsernameNotFoundException("Seller needs to be verified first by email and by admin");
			}
			
			return new org.springframework.security.core.userdetails.User(
						seller.getEmail(),
						seller.getPassword(),
						List.of(new SimpleGrantedAuthority("ROLE_SELLER"))
					);
		}
		
		throw new UsernameNotFoundException("User Not Found"); 
	}
}
















