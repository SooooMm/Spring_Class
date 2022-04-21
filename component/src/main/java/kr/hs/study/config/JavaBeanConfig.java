package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean2;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class JavaBeanConfig {

}
