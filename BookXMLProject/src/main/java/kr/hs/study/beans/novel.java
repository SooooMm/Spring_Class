package kr.hs.study.beans;

public class novel implements Book {
	private String book;
	private String name;
	private int price;
	public novel() {
		// TODO Auto-generated constructor stub
	}
	public novel(int price,String book, String name) {
		this.price=price;
		this.book=book;
		this.name=name;
	}

	public void buy() {
		System.out.println(name+"�� �Ҽ�'"+book+"'�� "+price+"�� ���");
	}

	public void create() {
		System.out.println(name+"�� �Ҽ�'"+book+"'�� "+price+"�� �����");
	}

	public void sell() {
		System.out.println(name+"�� �Ҽ�'"+book+"'�� "+price+"�� �Ǵ�");
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
