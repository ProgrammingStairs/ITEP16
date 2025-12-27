package com.ajax.dto;

import java.io.Serializable;

public class City implements Serializable{
	private int cityid;
	private int stateid;
	private String cityname;
	
	public City() {
		super();
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	
	
}
