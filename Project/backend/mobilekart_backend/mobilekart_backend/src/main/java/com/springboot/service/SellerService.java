package com.springboot.service;

import com.springboot.dto.SellerRequestDTO;
import com.springboot.dto.SellerResponseDTO;

public interface SellerService {
	SellerResponseDTO sellerRegistration(SellerRequestDTO request);
}
