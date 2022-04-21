package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.config.javaBeanConfig;

public class MainClass {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(javaBeanConfig.class);
	
	Test t1 = ctx.getBean("t1",Test.class);

	//ctx.close()
}
