package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Login;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestDAO obj1 = ctx.getBean(TestDAO.class);
		
		/*
		 * Login user1 = new Login(); user1.setUsers("kim", "1111", "김다리");
		 * 
		 * Login user2 = new Login(); user2.setUsers("lee", "2222", "이로니");
		 * 
		 * Login user3 = new Login(); user3.setUsers("park", "3333", "박호니");
		 * 
		 * obj1.Insert_data(user1); obj1.Insert_data(user2); obj1.Insert_data(user3);
		 */
		
		//System.out.println("insert fin");
		
		List<Login> list = obj1.select_data();
		
		for(Login log: list) {
			System.out.println("data1 : "+log.getUserId());
			System.out.println("data2 : "+log.getUserPw());
			System.out.println("data3 : "+log.getUserName());

		}
		
		ctx.close();
	}
}
