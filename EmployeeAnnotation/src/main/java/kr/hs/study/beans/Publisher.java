package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pub1")
public class Publisher implements Employee{
	private int startTime;
	private int endTime;
	
	public Publisher(@Value("11")int startTime,@Value("6")int endTime) {
		this.endTime = endTime;
		this.startTime = startTime;
	}
	public void Checkin() {
		System.out.println("�ۺ��� "+startTime+"�� ���");
	}
	public void Checkout() {
		System.out.println("�ۺ���  "+endTime+"�� ���");
	}
	
	
}
