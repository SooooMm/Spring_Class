package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.config.JavaConfigurationClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigurationClass.class);
		
		Book nov1 = ctx.getBean("nov1",Book.class);
		nov1.buy();
		
		Book mag1 = ctx.getBean("mag1",Book.class);
		mag1.sell();
		
		Book pot1 = ctx.getBean("pot1",Book.class);
		pot1.create();
		
		ctx.close();
	}

}
