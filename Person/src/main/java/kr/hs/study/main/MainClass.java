package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfigClass;


public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		Test t1 = ctx.getBean("java1", Test.class);
//		t1.getP1().eat();
//		t1.getP2().eat();
			

	}
}
