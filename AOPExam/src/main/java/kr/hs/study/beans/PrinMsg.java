package kr.hs.study.beans;

public class PrinMsg implements IPrintMsg{
	
	public void sayHello() {
		System.out.println("hello aop1");
	}
	public void sayHello2() {
		System.out.println("hello aop2");
	}
}
