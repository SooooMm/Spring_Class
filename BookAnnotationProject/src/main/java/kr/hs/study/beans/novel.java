package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("nov1")
public class novel implements Book{
	private int price;
	private String name;
	private String author;
	
	public novel(@Value("kim")String author,@Value("spring")String name,@Value("8000")int price ) {
		this.price = price;
		this.name=name;
		this.author = author;
	}
	public void buy() {
		System.out.println(author+"�� �Ҽ�"+name+"�� "+price+"�� ���");
	}
	public void create() {
		System.out.println(author+"�� �Ҽ�"+name+"�� "+price+"�� �����");
	}
	public void sell() {
		System.out.println(author+"�� �Ҽ�"+name+"�� "+price+"�� �Ǵ�");
	}
	
	
}
