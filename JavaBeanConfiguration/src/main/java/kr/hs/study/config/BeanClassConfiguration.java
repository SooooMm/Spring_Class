package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

//config.xml�� ���Ұ� �����ϴ�(bean ����)

@Configuration
public class BeanClassConfiguration {

	//bean ���� : <bean id="t1" class="kr.hs.study.beans.TestBean1"/>
	@Bean // �Ʒ� ������ �޼ҵ�� �� ����
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1; //t1 ��ü ���� 
	}
	
	@Bean
	public TestBean1 java2() {
		return new TestBean1();
	}
}
