package com.eichee.container;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	@Test
	public void test1(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/container/beans.xml");
		UserService userService=applicationContext.getBean(UserService.class);
		UserService userService2=(UserService) applicationContext.getBean("userService");
		
		System.out.println(userService);
		System.out.println(userService2);
	}
}
