package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldEn();
		callMethod(hello1); //��ü�� �������� �ʰ� ȣ���� ex) hello.callmethod X
		
	}
	
	//static ��ü �������ص� ȣ�� ����
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
