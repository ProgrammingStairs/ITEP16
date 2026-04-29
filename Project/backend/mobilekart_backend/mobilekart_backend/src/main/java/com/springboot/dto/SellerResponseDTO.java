package com.springboot.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SellerResponseDTO {
	private int sellerid;
	private String shopname;
	private String email;
	private String contact;
	private String gstno;
	private String panno;
	private String address;
	private String accountno;	
	private String sellerstatus;
	private String emailverify;
	private String adminverify;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;	
}
