package kr.hs.study.beans;

public class poet implements Book {
	private String book;
	private String name;
	private int price;
	
	public poet() {
		// TODO Auto-generated constructor stub
	}
	public poet(int price,String book, String name) {
		this.price=price;
		this.book=book;
		this.name=name;
	}

	public void buy() {
		System.out.println(name+"의 시'"+book+"'을 "+price+"에 산다");
	}

	public void create() {
		System.out.println(name+"의 시'"+book+"'을 "+price+"에 만든다");
	}

	public void sell() {
		System.out.println(name+"의 시'"+book+"'을 "+price+"에 판다");
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
