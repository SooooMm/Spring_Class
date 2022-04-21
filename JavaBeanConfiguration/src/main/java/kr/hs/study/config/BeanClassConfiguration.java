package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

//config.xml의 역할과 동일하다(bean 생성)

@Configuration
public class BeanClassConfiguration {

	//bean 생성 : <bean id="t1" class="kr.hs.study.beans.TestBean1"/>
	@Bean // 아래 나오는 메소드로 빈 생성
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1; //t1 객체 생성 
	}
	
	@Bean
	public TestBean1 java2() {
		return new TestBean1();
	}
}
