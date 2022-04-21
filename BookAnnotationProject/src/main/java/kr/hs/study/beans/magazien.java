package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mag1")
public class magazien implements Book{
	private int price;
	private String name;
	private String author;
	
	public magazien(@Value("park")String author,@Value("spring3")String name,@Value("18000")int price ) {
		this.price = price;
		this.name=name;
		this.author = author;
	}
	public void buy() {
		System.out.println(author+"�� ����"+name+"�� "+price+"�� ���");
	}
	public void create() {
		System.out.println(author+"�� ����"+name+"�� "+price+"�� �����");
	}
	public void sell() {
		System.out.println(author+"�� ����"+name+"�� "+price+"�� �Ǵ�");
	}
	
	
}
