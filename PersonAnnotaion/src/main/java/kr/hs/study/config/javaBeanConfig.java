package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;

@Configuration
@ComponentScan("kr.hs.study.beans")
public class javaBeanConfig {
	
	@Bean
	@Qualifier("p1")
	public Person per1() {
		return new Person("소은","피자",20);
	}
	
	@Bean
	@Qualifier("p2")
	public Person per2() {
		return new Person("해정","건빵",19);
	}
}
