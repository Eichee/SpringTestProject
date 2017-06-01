package com.eichee.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyMethodInterceptor implements MethodInterceptor{

	private MyTarget myTarget;
	
	public MyMethodInterceptor(MyTarget myTarget) {
		this.myTarget = myTarget;
	}



	@Override
	public Object intercept(Object proxyObject, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		System.out.println("PreLoad");
		Object returnValue=method.invoke(myTarget, args);
		System.out.println("PostLoad");
		return returnValue;
	}

}
