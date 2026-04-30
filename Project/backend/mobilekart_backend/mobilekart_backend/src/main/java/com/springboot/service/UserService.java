package com.springboot.service;

import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;

public interface UserService {
	UserResponseDTO userRegistration(UserRequestDTO request);
}
