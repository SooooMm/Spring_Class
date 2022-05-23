package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class Mainclass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestDAO obj1 = ctx.getBean(TestDAO.class);
		
		//insert
		/*
		 * TestBean t1 = new TestBean(); t1.setData1(100); t1.setData2("hi Spring");
		 * 
		 * obj1.insert_data(t1);
		 * 
		 * TestBean t2 = new TestBean(); t2.setData1(20); t2.setData2("hiSpr");
		 * 
		 * obj1.insert_data(t2);
		 * System.out.println("insert success");
		 */
		
		//update
		/*
		 * TestBean t3 = new TestBean(); t3.setData1(20); t3.setData2("good");
		 * obj1.update_data(t3); System.out.println("update !!!");
		 */
		
		//delete
		/*TestBean t4 = new TestBean();
		t4.setData1(20);
		obj1.delete_data(t4);
		System.out.println("delete");*/
		
		List<TestBean> list = obj1.select_data();
		
		
		ctx.close();

	}

}
