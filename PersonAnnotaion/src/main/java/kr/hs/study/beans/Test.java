package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t1")
public class Test {
	
	@Autowired
	@Qualifier("p1")
	private Person p1;
	
	@Autowired
	@Qualifier("p2")
	private Person p2;
	
	
	public Test() {

	}
	
	public Test(Person p1, Person p2){
		this.p1=p1;
		this.p2=p2;
		
	}
	
	
}
