package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.weaver.tools.Traceable;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("advice의 전에 실행");
	}
	
	public void afterMethod() {
		System.out.println("advice의 후에 실행");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around 호출 1");
		pjp.proceed();
		System.out.println("aournd 호출 2");
		
	}
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod 호출");
		System.out.println("e : "+e);
	}
}
