package com.springboot.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class MobileResponseDTO {
	private int mobileid;
	private int sellerid;
	private String brand;
	private String modelname;
	private String description;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;
	
	List<MobileVariantResponseDTO> variants = new ArrayList<>();
}
