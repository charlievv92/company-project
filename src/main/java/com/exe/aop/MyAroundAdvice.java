package com.exe.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


//beforeAdvice + afterAdvice 동시에 실행
@Aspect
@Component
public class MyAroundAdvice {

	@Around("execution(public void com..aop.*.*(..))")
	public Object aroundMethodCall(ProceedingJoinPoint joinPoint) {
		
		Object result = null;
		
		try {

			//메소드 실행 전 하고싶은 작업
			System.out.println("메소드 실행 전(AroundBefore)...");
			
			result = joinPoint.proceed();
			
			//메소드 실행 후 하고싶은 작업
			System.out.println("메소드 실행 후(AroundAfter)...");			

		} catch (Throwable e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
	
}
