package kr.hs.study.config;

import java.awt.print.Book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.publisher;

@Configuration
public class JavaBeanConfig {
	@Bean
	public Designer des1() {
		Designer person = new Designer();
		person.setStart(7);
		person.setEnd(10);
		return person;
	}
	
	@Bean
	public Developer dev1() {
		Developer person = new Developer();
		person.setStart(10);
		person.setEnd(7);
		return person;
	}
	
	@Bean
	public publisher pub1() {
		publisher person = new publisher();
		person.setStart(9);
		person.setEnd(6);
		return person;
	}
}	
