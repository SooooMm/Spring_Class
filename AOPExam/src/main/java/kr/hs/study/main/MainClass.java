package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.IPrintMsg;
import kr.hs.study.beans.PrinMsg;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		IPrintMsg p1 = ctx.getBean("P1",IPrintMsg.class);
		p1.sayHello();
		System.out.println("----------------------------------");
		p1.sayHello2();
		
		ctx.close();
	}

}
