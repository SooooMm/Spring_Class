package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean obj1 = ctx.getBean("t1",TestBean.class);
		System.out.println("Data1 : "+obj1.getData1());
		System.out.println("Data2 : "+obj1.getData2());
		System.out.println("Data3 : "+obj1.isData3());
		System.out.println("Data4 : "+obj1.getData4());
		
		TestBean2 obj2 = ctx.getBean("t2",TestBean2.class);
		System.out.println("Data1 : "+obj2.getData1());
		System.out.println("Data2 : "+obj2.getData2());
		
		ctx.close();
	}

}
