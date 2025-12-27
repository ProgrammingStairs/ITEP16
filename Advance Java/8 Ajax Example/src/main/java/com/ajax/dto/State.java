package com.ajax.dto;

import java.io.Serializable;

public class State implements Serializable{
	private int stateid;
	private String statename;
	public State() {
		super();
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	
}
