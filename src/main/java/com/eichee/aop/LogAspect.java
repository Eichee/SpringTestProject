package com.eichee.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class LogAspect {

	public void log(JoinPoint joinPoint){
		Object target=joinPoint.getTarget();
		Signature signature=joinPoint.getSignature();
		Object[] args=joinPoint.getArgs();
		
		System.out.println("Log");
	}
	
}
