package com.eichee.annotation.aop;

public class MyTarget {

	public String show(){
		System.out.println("MyTarget show()");
		return "Hello aop";
	}
}
