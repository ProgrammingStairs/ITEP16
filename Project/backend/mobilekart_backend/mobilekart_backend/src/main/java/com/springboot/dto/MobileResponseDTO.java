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
	public MobileResponseDTO() {}
	public MobileResponseDTO(int mobileid, int sellerid, String brand, String modelname, String description,
			LocalDateTime createdat, LocalDateTime updatedat) {
		super();
		this.mobileid = mobileid;
		this.sellerid = sellerid;
		this.brand = brand;
		this.modelname = modelname;
		this.description = description;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}
	
	
}
