package com.eichee.annotation.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* com.eichee.annotation.*.*(..))")
	public void myPointcut1(){
		
	}
}
