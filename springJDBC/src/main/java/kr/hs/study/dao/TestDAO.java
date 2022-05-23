package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

//���� ������ �ۼ��ϴ� ��
@Component
public class TestDAO {
	//jdbcTemplate�� �ڵ�����
	@Autowired
	private JdbcTemplate db;
	
	@Autowired
	MapperClass mapper; 
	//Container�� �ִ� mapper Ŭ������ ã�Ƽ� ���Խ��Ѷ�
	
	//���� ������ �˷��ִ� ��
	//1. insert
	public void insert_data(TestBean bean) {
		//autowired�� container�� �־��ְ� �װ� bean�� �ڵ����Եȴ�
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	//2. Update
	public void update_data(TestBean bean) {
		String sql = "update test set data2 = ? where data1= ?";
		db.update(sql,bean.getData2(),bean.getData1());
	}

	//3. delete
	public void delete_data(int data) {
		String sql = "delete from test where data1 = ?";
		db.update(sql,data);
	}
	
	//4. select
	public List<TestBean> select_data() {
		String sql = "select * from users";
		db.query(sql, mapper);
		return 
	}
}
