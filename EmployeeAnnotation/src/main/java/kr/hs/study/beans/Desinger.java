package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("des1")
public class Desinger implements Employee{
	private int startTime;
	private int endTime;
	
	public Desinger(@Value("7")int startTime,@Value("10")int endTime) {
		this.endTime = endTime;
		this.startTime = startTime;
	}
	public void Checkin() {
		System.out.println("�����̳� "+startTime+"�� ���");
	}
	public void Checkout() {
		System.out.println("�����̳� "+endTime+"�� ���");
	}
	
	
}
