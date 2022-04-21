package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean3 t1=ctx.getBean("t1",TestBean3.class); //다운캐스팅
		System.out.println(t1.getData1()); 
		System.out.println(t1.getData2()); 
		System.out.println(t1.getData3()); 
		System.out.println(t1.getData4()); 

	}

}
