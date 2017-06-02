package com.eichee.aop;

@MyAnnotation
public class MyTarget implements MyInterface{

	@Override
	public void show(){
		System.out.println("MyTarget show()");
	}

	@Override
	public String show(String str) {
		System.out.println("MyTarget show(String str)");
		return "Hello AOP";
	}

	@Override
	public void show(Integer age) throws Exception {
		System.out.println("MyTarget show(Integer age)");
		throw new Exception();
	}
}
