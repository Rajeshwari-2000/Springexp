package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before("execution(* com.demo.beans.*.m*(int))")
	public void beforeadvice() {
		System.out.println("in before advice 111");
	}
	
	@After("execution(* com.demo.beans.*.m*(int))")
	public void afteradvice() {
		System.out.println("in after advice 111");
	} 
	@Around("execution(* com.demo.beans.*.m*(int))")
	public Object aroundAdvice(ProceedingJoinPoint jp)throws Throwable {
		System.out.println("In Around Advice before Function call");
		Object ob=jp.proceed();
		System.out.println("In Around Advice After Function call");
		return ob;
	}
	
}