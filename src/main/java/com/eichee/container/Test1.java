package com.eichee.container;

import java.sql.SQLException;

import javax.sql.DataSource;

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
	
	@Test
	public void test2(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/container/beans.xml");
		UserService userService=(UserService)applicationContext.getBean("userService");
		System.out.println(userService.getUserDao());
	}
	
	@Test
	public void test3() throws SQLException{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/container/beans.xml");
		DataSource dataSource=(DataSource)applicationContext.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void test4(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/container/beans.xml");
		Team team=applicationContext.getBean(Team.class);
		System.out.println(team.getMembers());
	}
	
	@Test
	public void test5(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/eichee/container/beans.xml");
		User user=applicationContext.getBean(User.class);
		System.out.println(user.getName()+":"+user.getAge());
	}
	
}
