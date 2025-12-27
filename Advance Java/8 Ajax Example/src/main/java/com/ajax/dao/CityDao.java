package com.ajax.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ajax.connection.GetConnection;
import com.ajax.dto.City;

public class CityDao {

	// fetching all city data based on state id
	public List<City> getCityList(int stateid){
		List<City> cityList = new ArrayList<City>();
		try {
			Connection con = GetConnection.getConnect();
			String query = "select * from city where stateid=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, stateid);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				City city= new City();
				city.setCityid(rs.getInt(1));
				city.setStateid(rs.getInt(2));
				city.setCityname(rs.getString(3));
				cityList.add(city);
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return cityList;
	}
}









