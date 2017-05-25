package com.eichee.container;

public class UserServiceStaticFactory {
	
	public static UserService createUserService(){
		return new UserService();
	}
}
