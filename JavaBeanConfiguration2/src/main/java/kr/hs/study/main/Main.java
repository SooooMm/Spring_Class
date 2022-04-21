package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;

public class Main {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1  = ctx.getBean("java1",TestBean1.class);
		System.out.println(obj1);
		
		TestBean1 obj2  = ctx.getBean("new",TestBean1.class);
		System.out.println(obj2);
		
		TestBean1 obj3  = ctx.getBean("new",TestBean1.class);
		System.out.println(obj3);
		
		TestBean1 obj4  = ctx.getBean("java3",TestBean1.class);
		System.out.println(obj4);
		
		TestBean1 obj5  = ctx.getBean("java3",TestBean1.class);
		System.out.println(obj5);
		
		System.out.println();
		TestBean3 t1 = ctx.getBean("test", TestBean3.class);
		System.out.println(t1);
		
		TestBean3 t2 = ctx.getBean("t2", TestBean3.class);
		System.out.println(t2);
		
		
		TestBean4 t4 = ctx.getBean("java4", TestBean4.class);
		System.out.println(t4.getData1());
		System.out.println(t4.getData2());
		System.out.println(t4.getData3());
		
		TestBean4 t5 = ctx.getBean("java5", TestBean4.class);
		System.out.println(t5.getData1());
		System.out.println(t5.getData2());
		System.out.println(t5.getData3());
		
		
		ctx.close();
	}
}
