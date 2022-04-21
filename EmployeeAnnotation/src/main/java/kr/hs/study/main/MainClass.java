package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Employee;
import kr.hs.study.config.JavaBeanConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		
		Employee des = ctx.getBean("des1",Employee.class);
		des.Checkin();
		des.Checkout();
		
		Employee dev = ctx.getBean("dev1",Employee.class);
		dev.Checkin();
		dev.Checkout();
		
		Employee pub = ctx.getBean("pub1",Employee.class);
		pub.Checkin();
		pub.Checkout();
		
		
		ctx.close();
	}

}
