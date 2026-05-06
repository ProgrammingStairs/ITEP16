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
	
	public SellerResponseDTO(){}

	public SellerResponseDTO(int sellerid, String shopname, String email, String contact, String gstno, String panno,
			String address, String accountno, String sellerstatus, String emailverify, String adminverify,
			LocalDateTime createdat, LocalDateTime updatedat) {
		super();
		this.sellerid = sellerid;
		this.shopname = shopname;
		this.email = email;
		this.contact = contact;
		this.gstno = gstno;
		this.panno = panno;
		this.address = address;
		this.accountno = accountno;
		this.sellerstatus = sellerstatus;
		this.emailverify = emailverify;
		this.adminverify = adminverify;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}
	
}
