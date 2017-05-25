package com.eichee.container;

public class UserServiceFactory {
	
	public UserService createUserService(){
		return new UserService();
	}
}
