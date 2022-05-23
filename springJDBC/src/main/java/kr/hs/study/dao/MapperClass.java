package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class MapperClass implements RowMapper<TestBean>{
	
	@Override
    public TestBean mapRow(ResultSet rs, int rowNum) {
		TestBean user = new TestBean();
        user.setData1(rs.getInt(rowNum));
        user.setData2(rs.getString("password"));
        return user;
    }
}

