package kr.hs.study.config;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

@Configuration
public class JavaConfigurationClass {
	
	@Bean
	public Book nov1() {
		Book bok = new novel(8000,"spring4","kim");
		return bok;
	}
	
	@Bean
	public Book mag1() {
		Book bok = new magazine(18000,"spring4","lee");
		return bok;
	}
	
	@Bean
	public Book pot1() {
		Book bok = new poet(8000,"spring2","park");
		return bok;
	}
}
