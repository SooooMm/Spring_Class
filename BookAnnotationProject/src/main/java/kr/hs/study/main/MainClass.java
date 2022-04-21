package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.config.JavaBeanConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		Book nov = ctx.getBean("nov1",Book.class);
		nov.buy();
		
		Book pot = ctx.getBean("pot1",Book.class);
		pot.buy();
		
		Book mag = ctx.getBean("mag1",Book.class);
		mag.buy();
		
		ctx.close();
	}

}
