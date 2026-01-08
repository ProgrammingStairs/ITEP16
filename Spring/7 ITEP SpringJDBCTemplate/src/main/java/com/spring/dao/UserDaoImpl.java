// ############### JDBC TEMPLATE #####################

//package com.spring.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import com.spring.model.User;
//@Repository
//public class UserDaoImpl implements UserDao{
//	
//	private JdbcTemplate jdbcTemplate;
//	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//	
//	RowMapper<User> rowMapper =  new RowMapper<User>() {
//		@Override
//		public User mapRow(ResultSet rs,int rowno) throws SQLException {
//			User user = new User();
//			user.setUid(rs.getInt(1));
//			user.setUsername(rs.getString(2));
//			user.setEmail(rs.getString(3));
//			user.setAddress(rs.getString(4));
//			return user;
//		}
//	};
//	
//	@Override
//	public void addUser(User user) {
//		String query = "insert into userjdbctemplate(uid,username,email,address) values(?,?,?,?)";
//		jdbcTemplate.update(query,user.getUid(),user.getUsername(),user.getEmail(),user.getAddress());
//	}
//	
//	@Override
//	public void updateUser(User user) {
//		String query = "update userjdbctemplate set username=?,email=?,address=? where uid=?";
//		jdbcTemplate.update(query,user.getUsername(),user.getEmail(),user.getAddress(),user.getUid());
//	}
//
//	@Override
//	public void deleteUser(int id) {
//		String query = "delete from userjdbctemplate where uid=?";
//		jdbcTemplate.update(query,id);
//	}
//	
//	@Override
//	public User getUser(int id) {
//		String query = "select * from userjdbctemplate where uid=?";
//		return jdbcTemplate.queryForObject(query, rowMapper , id);
//	}
//
//	@Override
//	public List<User> getAllUser() {
//		String query = "select * from userjdbctemplate";
//		return jdbcTemplate.query(query, rowMapper);
//	}
//
//}

// #################### Named Parameter Jdbc Template #################### 

package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	
	// needs to create table manually
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public UserDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	RowMapper<User> rowMapper =  new RowMapper<User>() {
		@Override
		public User mapRow(ResultSet rs,int rowno) throws SQLException {
			User user = new User();
			user.setUid(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setEmail(rs.getString(3));
			user.setAddress(rs.getString(4));
			return user;
		}
	};
	
	@Override
	public void addUser(User user) {
		String query = "insert into userjdbctemplate(uid,username,email,address) values(:uid,:username,:email,:address)";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uid", user.getUid());
		map.put("username",user.getUsername());
		map.put("email", user.getEmail());
		map.put("address", user.getAddress());
		namedParameterJdbcTemplate.update(query,map);
	}
	
	@Override
	public void updateUser(User user) {
		String query = "update userjdbctemplate set username=:username,email=:email,address=:address where uid=:uid";
		MapSqlParameterSource map = new MapSqlParameterSource()
				.addValue("username", "updated name")
				.addValue("email", "update@gmail.com")
				.addValue("address", "USA")
				.addValue("uid", 101);
		namedParameterJdbcTemplate.update(query,map);
	}

	@Override
	public void deleteUser(int id) {
		String query = "delete from userjdbctemplate where uid=:uid";
		MapSqlParameterSource map = new MapSqlParameterSource("uid", id);
		namedParameterJdbcTemplate.update(query,map);
	}
	
	@Override
	public User getUser(int id) {
		String query = "select * from userjdbctemplate where uid=:uid";
		MapSqlParameterSource map = new MapSqlParameterSource("uid", id);
		return namedParameterJdbcTemplate.queryForObject(query,map,rowMapper);
	}

	@Override
	public List<User> getAllUser() {
		String query = "select * from userjdbctemplate";
		return namedParameterJdbcTemplate.query(query, rowMapper);
	}

}



/*
 	?,?,? <----- represents positional parameters
    :name,:address <------ represents named parameters
 */

/*
 public class UserDaoImpl implements UserDao{
	private JdbcTemplate jdbcTemplate;
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
here on creation of userdaoimpl object, jdbctemplate instance is going to be inject

but 
 public class UserDaoImpl implements UserDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
}

but in this case, object of UserDaoImpl is created and at that time jdbctemplate object is not injected yet

UserDaoImpl instance = new UserDaoImpl();

    @Autowired
    JdbcTemplate jdbcTemplate;

 */