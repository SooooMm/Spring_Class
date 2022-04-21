package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

public class main {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book obj1 = ctx.getBean("nov1",Book.class);
		obj1.buy();
		
		Book obj2 = ctx.getBean("pot1",Book.class);
		obj2.buy();
		
		Book obj3 = ctx.getBean("mag1",Book.class);
		obj3.buy();
		
		
		ctx.close();
	}
}
