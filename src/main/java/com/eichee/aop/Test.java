package com.eichee.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void test1(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/aop/beans.xml");
		MyInterface proxyObject=applicationContext.getBean(MyInterface.class);
		proxyObject.show();
		
	}
	
	@org.junit.Test
	public void test2(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/aop/beans.xml");
		MyInterface proxyObject=applicationContext.getBean(MyInterface.class);
		proxyObject.show("12345");
	}
	
	@org.junit.Test
	public void test3() throws Exception{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/aop/beans.xml");
		MyInterface proxyObject=applicationContext.getBean(MyInterface.class);
		proxyObject.show(12);
	}
}
