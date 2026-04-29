package com.springboot.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserResponseDTO {
	private int userid;
	private String name;
	private String email;
	private String contact;
	private String gender;
	private LocalDateTime createdat;
	private LocalDateTime updatedat;
}
