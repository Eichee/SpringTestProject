package com.eichee.proxy.jdk;

import java.lang.reflect.Proxy;

public class Test {

	@org.junit.Test
	public void test1(){
		MyTarget myTarget=new MyTarget();
		MyInvocationHandler myInvocationHandler=new MyInvocationHandler(myTarget);
		
		MyInterface proxyObject=(MyInterface)Proxy.newProxyInstance(MyTarget.class.getClassLoader(),
				MyTarget.class.getInterfaces(),myInvocationHandler);
		
		proxyObject.show();
		
		System.out.println("-----------------------------");
		
		String str=proxyObject.toString();
		System.out.println(str);
		
		System.out.println("------------------------------");
		myTarget.show();
	}
}
