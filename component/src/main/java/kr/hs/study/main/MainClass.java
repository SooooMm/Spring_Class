package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.JavaBeanConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 obj1 = ctx2.getBean(TestBean1.class);
		System.out.println("obj1 : "+obj1);
		
		
		ctx2.close();
		System.out.println("----------------------------------------------------------------------------------------------------");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		TestBean2 java1 = ctx.getBean("t2",TestBean2.class);
		System.out.println("java1 : "+java1);
		
		
		
		ctx.close();
		
	}

}
