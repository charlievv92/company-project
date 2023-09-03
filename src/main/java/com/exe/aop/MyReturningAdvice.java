package com.exe.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//After�� ��������� ���������� ������� ��
@Aspect
@Component
public class MyReturningAdvice {
	
	@AfterReturning("execution(public void com..aop.*.*(..))")
	public void afterReturningCall() {
		
		System.out.println("�޼ҵ� ���� ���� ��(Return)...");
		
	}
	
}
