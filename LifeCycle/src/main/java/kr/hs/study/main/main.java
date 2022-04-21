package kr.hs.study.main;

import java.io.Closeable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean1;

public class main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		DataBean1 obj1 = ctx.getBean("d1",DataBean1.class);
		//출력 : DataBean1의 기본생성자
		DataBean1 obj2 = ctx.getBean("d2",DataBean1.class);
		//출력 : DataBean1의 기본생성자
		
		DataBean1 obj3 = ctx.getBean("d3",DataBean1.class);
		DataBean1 obj4 = ctx.getBean("d3",DataBean1.class);
		
		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		System.out.println("obj3 : "+obj3);
		System.out.println("obj4 : "+obj4);
		
		ctx.close();
	}

}
