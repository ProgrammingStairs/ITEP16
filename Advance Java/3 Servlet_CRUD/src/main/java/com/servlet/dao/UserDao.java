package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.servlet.connection.GetConnection;
import com.servlet.dto.UserDto;

public class UserDao{
	
	// adding user 
	public int addUser(UserDto userDto) {
		int i=0;
		try {
			Connection con = GetConnection.getConnect();
			String insertQuery = "insert into servlet_user(username,email,password,address) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setString(1, userDto.getUsername());
			ps.setString(2, userDto.getEmail());
			ps.setString(3, userDto.getPassword());
			ps.setString(4, userDto.getAddress());
			
			i = ps.executeUpdate();
			System.out.println("User added successfully in dao");
		}catch(Exception e) {
			i=2;
			System.out.println("Exception : "+e);
		}
		return i;
	}
	
	// check for user login
	public boolean loginUser(String email,String password) {
		boolean status = false;
		try {
			Connection con = GetConnection.getConnect();
			String selectQuery = "select * from servlet_user where email=? and password=?";
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery(); 
			if(rs.next()) 
				status = true;
				
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return status;
	}
}