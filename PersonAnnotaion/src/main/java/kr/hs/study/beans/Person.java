package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	String name;
	int age;
	String food;
	
	public Person(String name, String food, int age) {
		this.name=name;
		this.age=age;
		this.food=food;
		eat();
	}
	
	public void eat() {
		System.out.println(age+"살인 "+name+"이 "+food+"를 먹습니다");
	}
}
