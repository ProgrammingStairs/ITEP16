package com.jpa.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dept_many_one_uni")
public class Department{ // inverse side | non-owning side
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int did;
	
	@Column(name="dept_name")
	String deptName;
	
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}