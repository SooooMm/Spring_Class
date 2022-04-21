package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaBeanConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		
		TestBean1 t1 = ctx.getBean(TestBean1.class);
		System.out.println(t1.getData1());
		System.out.println(t1.getData2());
		System.out.println(t1.getData3());
		ctx.close();
	}

}
