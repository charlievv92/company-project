package com.exe.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//Aspect를 통해 aop 사용
@Aspect
@Component
public class MyAfterAdvice {
	
	@After("execution(public void com..aop.*.*(..))")
	public void afterMethodCall() {
		System.out.println("메소드 실행 후(AfterAdvice)...");
	}

}
