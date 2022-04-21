package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.weaver.tools.Traceable;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("advice�� ���� ����");
	}
	
	public void afterMethod() {
		System.out.println("advice�� �Ŀ� ����");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around ȣ�� 1");
		pjp.proceed();
		System.out.println("aournd ȣ�� 2");
		
	}
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod ȣ��");
	}
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod ȣ��");
		System.out.println("e : "+e);
	}
}
