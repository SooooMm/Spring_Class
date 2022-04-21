package kr.hs.study.beans;

public class novel implements Book {
	private String name;
	private String Book;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook() {
		return Book;
	}

	public void setBook(String book) {
		Book = book;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void buy() {
		System.out.println(name+"의 소설 '"+Book+"'을 "+price+"에 산다");
	}

	public void create() {
		System.out.println(name+"의 소설 '"+Book+"'을 "+price+"에 만든다");
	}

	public void sell() {
		System.out.println(name+"의 소설 '"+Book+"'을 "+price+"에 판다");
	}
}
