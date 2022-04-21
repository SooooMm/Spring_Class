package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	

	private Person p1;

	private Person p2;
	
	public Test() {
		
	}
	
	public Test(Person p1, Person p2){
		this.p1=p1;
		this.p2=p2;
		
	}
	public Person getP1() {
		return p1;
	}
	public Person getP2() {
		return p2;
	}


}
