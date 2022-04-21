package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Employee;
import kr.hs.study.config.JavaBeanConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		Employee n1 = ctx.getBean("des1",Employee.class);
		n1.Checkin();
		n1.Checkout();
		
		Employee n2 = ctx.getBean("dev1",Employee.class);
		n2.Checkin();
		n2.Checkout();
		
		Employee n3 = ctx.getBean("pub1",Employee.class);
		n3.Checkin();
		n3.Checkout();
		
		ctx.close();
	}

}
