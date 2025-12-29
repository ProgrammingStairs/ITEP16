package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.UserDto;
import com.jsp.connection.GetConnection;

public class UserDao{
	
	// adding user 
	public int addUser(UserDto userDto) {
		int i=0;
		try {
			Connection con = GetConnection.getConnect();
			String insertQuery = "insert into jsp_user(username,email,password,address) values(?,?,?,?)";
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
			String selectQuery = "select * from jsp_user where email=? and password=?";
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

	// search user by email
	public UserDto getUserByEmail(String email) {
		UserDto user = new UserDto();
		try {
			Connection con = GetConnection.getConnect();
			String selectQuery = "select * from jsp_user where email=?";
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				user.setUid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(4));
				user.setAddress(rs.getString(5));
			}
				
		}catch(Exception e) {
			System.out.println("Error while fetching user by email : "+e);
		}
		return user;
	}

	// updating user 
	public int updateUser(UserDto userDto) {
		int i=0;
		try {
			Connection con = GetConnection.getConnect();
			String updateQuery = "update jsp_user set username=?,password=?,address=? where email=?";
			PreparedStatement ps = con.prepareStatement(updateQuery);
			ps.setString(1, userDto.getUsername());
			ps.setString(2, userDto.getPassword());
			ps.setString(3, userDto.getAddress());
			ps.setString(4, userDto.getEmail());
			
			i = ps.executeUpdate();
			System.out.println("User Updated successfully in dao");
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return i;
	}
	
	// deactivating user
	public int deActivateUser(String email) {
		int i=0;
		try {
			Connection con = GetConnection.getConnect();
			String updateQuery = "delete from jsp_user where email=?";
			PreparedStatement ps = con.prepareStatement(updateQuery);
			ps.setString(1, email);
			
			i = ps.executeUpdate();
			System.out.println("User Deleted successfully in dao");
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return i;
	}

	// getAllUsersList 
	public List<UserDto> getAllUsers(){
		List<UserDto> list = new ArrayList<UserDto>();
		try {
			Connection con = GetConnection.getConnect();
			String selectQuery = "select * from jsp_user";
			PreparedStatement ps = con.prepareStatement(selectQuery);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				UserDto user = new UserDto();
				
				user.setUid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(4));
				user.setAddress(rs.getString(5));	
				
				list.add(user);
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return list;
	}
}
















