package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

@Configuration
//이 파일은 bean을 만들라고 명령하는 설정파일이다. == config.xml
public class BeanConfigClass {

	@Bean //나는 아래 메서드 실행한 애를 bean으로 만들어 컨테이너에 등록
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean(name="new") //이름을 java2 -> new로 변경
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	public TestBean1 java3() {
		return new TestBean1();
	}
	
	@Bean(name="test")
	@Lazy
	@Scope("prototype")
	public TestBean3 t1() {
		return new TestBean3();
	}
	
	@Bean
	public TestBean3 t2() {
		return new TestBean3();
	}
	
	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4(100, "spring4", new DataBean4());
		return t4;
	}
	
	@Bean
	public TestBean4 java5() {
		TestBean4 t4 = new TestBean4();
		t4.setData1(100);
		t4.setData2("spring4");
		t4.setData3(new DataBean4());
		
		return t4;
	}
}
