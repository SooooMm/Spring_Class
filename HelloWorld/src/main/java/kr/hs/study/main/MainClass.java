package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HelloWorld hello = ctx.getBean("helloKr",HelloWorldKr.class);
		callMethod(hello);
		
		
		ctx.close();
	}
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
