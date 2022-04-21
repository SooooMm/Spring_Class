package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldEn();
		callMethod(hello1); //객체를 생성하지 않고 호출함 ex) hello.callmethod X
		
	}
	
	//static 객체 생성안해도 호출 가능
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
