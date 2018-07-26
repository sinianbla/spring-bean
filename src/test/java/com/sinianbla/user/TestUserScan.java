package com.sinianbla.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinianbla.service.UserScanService;

public class TestUserScan {
	
	@Test
	public void test_01(){
		ApplicationContext application = new ClassPathXmlApplicationContext("bean2.xml");
		UserScanService userScanServce = (UserScanService)application.getBean("userScanService");
		userScanServce.add();
	}

}
