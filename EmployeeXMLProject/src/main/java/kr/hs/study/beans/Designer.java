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
		System.out.println("디자이너 "+start+"시 출근");
	}
	public void Checkout() {
		System.out.println("디자이너 "+end+"시 퇴근");
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
