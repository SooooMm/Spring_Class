package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pot1")
public class poet implements Book{
	private int price;
	private String name;
	private String author;
	
	public poet(@Value("lee")String author,@Value("spring2")String name,@Value("5000")int price ) {
		this.price = price;
		this.name=name;
		this.author = author;
	}
	public void buy() {
		System.out.println(author+"�� ��"+name+"�� "+price+"�� ���");
	}
	public void create() {
		System.out.println(author+"�� ��"+name+"�� "+price+"�� �����");
	}
	public void sell() {
		System.out.println(author+"�� ��"+name+"�� "+price+"�� �Ǵ�");
	}
	
	
}
