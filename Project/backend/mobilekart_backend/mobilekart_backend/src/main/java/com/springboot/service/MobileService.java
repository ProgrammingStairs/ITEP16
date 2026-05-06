package com.springboot.service;

import com.springboot.dto.MobileRequestDTO;
import com.springboot.dto.MobileResponseDTO;

public interface MobileService {
	MobileResponseDTO addMobile(MobileRequestDTO request);
}
