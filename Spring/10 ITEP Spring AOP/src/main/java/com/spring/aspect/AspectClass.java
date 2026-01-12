package com.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	
	@Pointcut("execution(* com.spring.service.*.*(..))")
	public void service() {}
	
	@Before("service()")
	public void beforeInvoke() {
		System.out.println("Advice Before takes place");
	}

	@After("service()")
	public void afterInvoke() {
		System.out.println("Advice After takes place");
	}

	@AfterReturning("service()")
	public void afterReturningInvoke() {
		System.out.println("Advice After Returning takes place");
	}

	@AfterThrowing("service()")
	public void afterThrowingInvoke() {
		System.out.println("Advice After Throwing takes place");
	}

//	@Around("service()")
//	public void aroundInvoke(ProceedingJoinPoint pjp) throws Throwable{
//		System.out.println("Inside around going to call method");
//		pjp.proceed();
//		System.out.println("Inside around after method calling");
//	}

	@Around("service()")
	public Object aroundInvoke(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Inside around going to call method");
		Object obj = pjp.proceed();
		System.out.println("Inside around after method calling");
		return obj;
	}

}
