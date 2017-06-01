package com.eichee.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Test {

	@org.junit.Test
	public void test(){
		MyTarget myTarget=new MyTarget();
		MyMethodInterceptor methodInterceptor=new MyMethodInterceptor(myTarget);
		
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(MyTarget.class);
		enhancer.setCallback(methodInterceptor);
		
		MyTarget proxyObject=(MyTarget)enhancer.create();
		
		proxyObject.show();
	}
}
