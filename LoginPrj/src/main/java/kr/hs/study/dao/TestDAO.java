package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.Login;

@Component
public class TestDAO {

	
	@Autowired
	private JdbcTemplate db;
	
	@Autowired
	MapperClass mapper;
	
	public void Insert_data(Login bean) {
		String sql = "insert into users values(?,?,?)";
		db.update(sql,bean.getUserId(),bean.getUserPw(),bean.getUserName());
	}
	
	public void Update_data(Login bean) {
		String sql = "update users set userName = ?, userPw = ? where userId = ?";
		db.update(sql,bean.getUserName(),bean.getUserPw(),bean.getUserId());
	}
	
	public void Delete_data(String s) {
		String sql = "delete users where userId = ? ";
		db.update(sql,s);
	}
	
	public List<Login> select_data() {
		String sql = "select * from users";
		List<Login> list= db.query(sql, mapper);
		return list;
	}
}
