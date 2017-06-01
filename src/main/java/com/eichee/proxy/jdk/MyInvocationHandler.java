package com.eichee.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	private MyTarget myTarget;
	
	public MyInvocationHandler(MyTarget myTarget) {
		this.myTarget = myTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("PreLoad");
		Object returnValue=method.invoke(myTarget, args);
		System.out.println("PostLoad");
		
		return returnValue;
	}
	
	
}
