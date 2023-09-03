package com.exe.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


//beforeAdvice + afterAdvice ���ÿ� ����
@Aspect
@Component
public class MyAroundAdvice {

	@Around("execution(public void com..aop.*.*(..))")
	public Object aroundMethodCall(ProceedingJoinPoint joinPoint) {
		
		Object result = null;
		
		try {

			//�޼ҵ� ���� �� �ϰ���� �۾�
			System.out.println("�޼ҵ� ���� ��(AroundBefore)...");
			
			result = joinPoint.proceed();
			
			//�޼ҵ� ���� �� �ϰ���� �۾�
			System.out.println("�޼ҵ� ���� ��(AroundAfter)...");			

		} catch (Throwable e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
	
}
