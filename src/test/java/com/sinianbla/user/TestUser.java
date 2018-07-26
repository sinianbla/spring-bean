package com.sinianbla.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinianbla.service.UserService;

public class TestUser {
	
	@Test
	public void test_01(){
		ApplicationContext application = new ClassPathXmlApplicationContext("bean.xml");
		UserService userServce = (UserService)application.getBean("userService");
		System.out.println(application.getBean("userService"));
		userServce.add();
	}

}
