package com.springboot.dto;

import lombok.Data;

@Data
public class UserRequestDTO {
	private String name;
	private String email;
	private String password;
	private String contact;
	private String gender;
	
}
