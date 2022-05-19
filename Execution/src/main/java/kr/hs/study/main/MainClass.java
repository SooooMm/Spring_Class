package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
	
		TestBean1 t1 = ctx.getBean("T1", TestBean1.class);
		t1.Method1();
		t1.Method2();
		t1.Method1(100);
		t1.Method1("happy");
		t1.Method1(5, 5);
		t1.Method1("good", 3);
		
		TestBean2 t2 = ctx.getBean("T2", TestBean2.class);
		t2.m1();
		t2.m1(2);
		t2.m2(2, 6);
		t2.Method1();
		
		TestBean3 t3 = ctx.getBean("T3",TestBean3.class);
		t3.Test3();
		
		//TestBean4 t4 = ctx.getBean("T4",TestBean4.class);
		
		ctx.close();
	}

}
