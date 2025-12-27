package com.ajax.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ajax.connection.GetConnection;
import com.ajax.dto.State;

public class StateDao {

	// fetching all state data
	public List<State> getStateList(){
		List<State> stateList = new ArrayList<State>();
		try {
			Connection con = GetConnection.getConnect();
			String query = "select * from state";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				State state = new State();
				state.setStateid(rs.getInt(1));
				state.setStatename(rs.getString(2));
				stateList.add(state);
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		return stateList;
	}
}









