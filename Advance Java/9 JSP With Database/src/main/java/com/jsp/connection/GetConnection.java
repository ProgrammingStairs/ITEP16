package com.jsp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConnection{
	public static Connection getConnect() {
		Connection con = null;
		try {
			Class.forName(GetDetails.DRIVER);
			con = DriverManager.getConnection(GetDetails.URL, GetDetails.USERNAME, GetDetails.PASSWORD);
			if(con!=null) {
				System.out.println("Connection established successfully");
			}
			String dbQuery = "create database if not exists itep16";
			Statement stmt = con.createStatement();
			stmt.execute(dbQuery);
			
			String useQuery = "use itep16";
			Statement stmtUse = con.createStatement();
			stmtUse.execute(useQuery);
			
			String createQuery = "create table if not exists jsp_user(uid int auto_increment primary key,username varchar(45) not null,email varchar(45) unique not null,password varchar(45) not null,address varchar(45) not null)";
			Statement stmtCreate = con.createStatement();
			stmtCreate.execute(createQuery);
			
			System.out.println("Application is ready to go..!!!");
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception : "+e);
		}
		return con;
	}
}