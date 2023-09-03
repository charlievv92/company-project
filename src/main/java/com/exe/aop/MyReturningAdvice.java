package com.exe.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//After와 비슷하지만 정상적으로 실행됐을 때
@Aspect
@Component
public class MyReturningAdvice {
	
	@AfterReturning("execution(public void com..aop.*.*(..))")
	public void afterReturningCall() {
		
		System.out.println("메소드 정상 실행 후(Return)...");
		
	}
	
}
