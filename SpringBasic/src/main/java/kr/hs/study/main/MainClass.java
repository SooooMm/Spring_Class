package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
//		config.xml 를 로딩시킨다 : 객체를 생성해서 컨테이너에 보관한다 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		

		TestBean t1 = (TestBean)ctx.getBean("t1"); //getBean() : 컨테이너에 있는 객체를 가져와서 사용 -> 리턴타입 object
		System.out.println("t1 : "+t1); //주소값 나옴
		
		TestBean t2 = ctx.getBean("t1",TestBean.class);
		System.out.println("t2 : "+t2);
		
//		TestBean t2 = (TestBean)ctx.getBean("t1");
//		System.out.println("t2 : "+t2); //위와 똑같이 사용 가능
		// t1과 t2의 주소값이 같다 -> 한번 만들면 계속 사용(singleton)
		
		ctx.close();
	}

}
