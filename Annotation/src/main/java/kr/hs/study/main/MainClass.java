package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.JavaBeanConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1 = ctx.getBean("xml1",TestBean1.class);
		System.out.println(t1.getData1());
		
		TestBean2 obj2 = ctx.getBean("xml2",TestBean2.class);
		System.out.println(obj2.getData1());
		
		
		TestBean2 obj3 = ctx.getBean("xml2",TestBean2.class);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());
		ctx.close();
		
		System.out.println("------------------------------------------------------------");
		
		/*
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		TestBean2 t2 = ctx2.getBean("java1",TestBean2.class);
		System.out.println(t2.getData1());
		ctx2.close();*/
	}

}
