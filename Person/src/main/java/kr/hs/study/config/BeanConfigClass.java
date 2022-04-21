package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public Test java1() {
		return new Test(new Person("«ÿ¡§", 19, "Ω¨≤©∫ÿ"), new Person("kim", 18, "ªÊ"));
	}

}
