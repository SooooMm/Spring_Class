package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void AdprMethod() {
		System.out.println("충고 advice 횡단 관심사");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around1");
		pjp.proceed();
		System.out.println("around2");
	}
}
