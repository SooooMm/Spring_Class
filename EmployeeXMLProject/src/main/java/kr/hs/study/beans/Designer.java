package kr.hs.study.beans;

public class Designer implements Employee{
	private int start;
	private int end;
	
	public Designer() {
		// TODO Auto-generated constructor stub
	}
	public Designer(int start,int end) {
		this.start=start;
		this.end=end;
	}
	
	public void Checkin() {
		System.out.println("�����̳� "+start+"�� ���");
	}
	public void Checkout() {
		System.out.println("�����̳� "+end+"�� ���");
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
