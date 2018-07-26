package com.sinianbla.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserScanServiceAop {
	
	@Before(value="execution(* com.sinianbla.service.UserScanService.*(..))")
	public void before1(){	
		System.out.println("«∞÷√‘ˆ«ø.......");
	}
}
