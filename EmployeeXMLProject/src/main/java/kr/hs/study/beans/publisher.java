package kr.hs.study.beans;

public class publisher implements Employee{
	private int start;
	private int end;
	
	public publisher() {
		// TODO Auto-generated constructor stub
	}
	public publisher(int start,int end) {
		this.start=start;
		this.end=end;
	}
	public void Checkin() {
		System.out.println("ÆÛºí¸®¼Å "+start+"½Ã Ãâ±Ù");
	}
	public void Checkout() {
		System.out.println("ÆÛºí¸®¼Å "+end+"½Ã Åğ±Ù");
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	};
	
	
}
