package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dev1")
public class Developer implements Employee{
	private int startTime;
	private int endTime;
	
	public Developer(@Value("10")int startTime,@Value("7")int endTime) {
		this.endTime = endTime;
		this.startTime = startTime;
	}
	public void Checkin() {
		System.out.println("개발자 "+startTime+"시 출근");
	}
	public void Checkout() {
		System.out.println("개발자 "+endTime+"시 퇴근");
	}
	
	
}
