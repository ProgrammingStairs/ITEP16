package com.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="passport_one_one_uni")
public class Passport{ // inverse side | non-owning side
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	
	@Column(name="passportNumber")
	String passportNumber;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
}