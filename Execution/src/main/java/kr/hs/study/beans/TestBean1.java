package kr.hs.study.beans;

public class TestBean1 {
	public void Method1() {
		System.out.println("Method1 클래스");
	}
	public void Method1(int a) {
		System.out.println("int 매개변수 Method1 클래스");
	}
	public void Method1(int a,int b) {
		System.out.println("int 매개변수 2개 Method1 클래스");
	}
	public void Method1(String s) {
		System.out.println("String 매개변수 Method1 클래스");
	}
	public void Method1(String s, int a) {
		System.out.println("String 매개변수 1개, int형 1개 Method1 클래스");
	}
	public void Method2() {
		System.out.println("Method2 클래스");
	}
}
