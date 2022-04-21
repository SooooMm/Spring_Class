package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		
		
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		System.out.println("T1 : "+t1);
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		System.out.println("T2 : "+t2);
		
		TestBean2 t3 = ctx.getBean("t2",TestBean2.class);
		System.out.println("T3 : "+t3);
		
		
		ctx.close();
	}

}
