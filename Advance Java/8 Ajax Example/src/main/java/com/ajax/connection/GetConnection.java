package com.ajax.connection;

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
			
			System.out.println("Application is ready to go..!!!");
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception : "+e);
		}
		return con;
	}
}