package com.eichee.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void myAfterReturning(JoinPoint joinPoint,Object returnValue){
		System.out.println("myAfterReturning actions, returnValue:"+returnValue);
	}
	
	public void myAfterThrowing(JoinPoint joinPoint,Exception exception){
		System.out.println("myAfterThrowing actions, exception:"+exception);
	}
	
	public void myAfter(JoinPoint joinPoint){
		System.out.println("myAfter actions");
	}
	
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("myAround preload");
		Object returnValue=joinPoint.proceed();
		System.out.println("myAround postLoad");
		return returnValue;
	}
}
