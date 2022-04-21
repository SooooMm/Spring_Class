package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.publisher;

public class main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Employee des1 = ctx.getBean("des1",Designer.class);
		des1.Checkin();
		des1.Checkout();
		
		Employee dev1 = ctx.getBean("dev1",Developer.class);
		dev1.Checkin();
		dev1.Checkout();
		
		Employee pub1 = ctx.getBean("pub1",publisher.class);
		pub1.Checkin();
		pub1.Checkout();
		
		ctx.close();
	}

}
