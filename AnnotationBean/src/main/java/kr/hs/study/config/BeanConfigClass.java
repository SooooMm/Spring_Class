package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean(name="xml2")
	public DataBean1 java2() {
		return new DataBean1();
	}
	
	@Bean(name="xml3")
	public DataBean2 java3() {
		return new DataBean2();
	}

	@Bean(name="t1")
	public TestBean2 t1() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean3 d3() {
		DataBean3 d3= new DataBean3();
		return d3;
	}
	
	@Bean
	public DataBean4 d4() {
		DataBean4 d4= new DataBean4();
		return d4;
	}

	
	@Bean
	public TestBean3 t3() {
		return new TestBean3(d3(),d4());
	}
}
