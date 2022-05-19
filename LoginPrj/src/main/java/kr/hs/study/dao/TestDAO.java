package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.Login;

@Component
public class TestDAO {

	@Autowired
	private JdbcTemplate db;
	
	public void Insert_data(Login bean) {
		String sql = "insert into users values(?,?,?)";
		db.update(sql,bean.getUserId(),bean.getUserPw(),bean.getUserName());
	}
}
