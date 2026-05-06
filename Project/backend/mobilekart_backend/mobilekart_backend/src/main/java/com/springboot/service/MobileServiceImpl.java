package com.springboot.service;

import org.springframework.stereotype.Service;
import com.springboot.dto.MobileRequestDTO;
import com.springboot.dto.MobileResponseDTO;
import com.springboot.dto.UserRequestDTO;
import com.springboot.dto.UserResponseDTO;
import com.springboot.entity.Mobile;
import com.springboot.entity.User;
import com.springboot.repository.MobileRepository;

import jakarta.transaction.Transactional;
@Service 
@Transactional
public class MobileServiceImpl implements MobileService{
	private MobileRepository mobileRepository;
	
	public MobileServiceImpl(MobileRepository mobileRepository) {
		this.mobileRepository=mobileRepository;
	}
	
	@Override
	public MobileResponseDTO addMobile(MobileRequestDTO request) {
		
		Mobile mobile= new Mobile();
		mobile.setSellerid(request.getSellerid());
		mobile.setBrand(request.getBrand());
		mobile.setModelname(request.getModelname());
		mobile.setDescription(request.getDescription());
		
		Mobile mobileObj = mobileRepository.save(mobile);
		MobileResponseDTO responseDTO = new MobileResponseDTO();
		responseDTO.setMobileid(mobileObj.getMobileid());
		responseDTO.setSellerid(mobileObj.getSellerid());
		responseDTO.setBrand(mobileObj.getBrand());
		responseDTO.setModelname(mobileObj.getModelname());
		responseDTO.setDescription(mobileObj.getDescription());
		responseDTO.setCreatedat(mobileObj.getCreatedat());
		responseDTO.setUpdatedat(mobileObj.getUpdatedat());
				
		return responseDTO;
	}
}
