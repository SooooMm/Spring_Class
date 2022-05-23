package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.Login;

@Component
public class MapperClass implements RowMapper<Login>{

	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Login user = new Login();
	     user.setUserId(rs.getString("userid"));
	     user.setUserPw(rs.getString("userpw"));
	     return user;
		
	}
	
}
