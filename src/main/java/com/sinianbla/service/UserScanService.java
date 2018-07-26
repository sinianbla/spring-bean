package com.sinianbla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinianbla.dao.UserScanDao;


@Service("userScanService")
public class UserScanService {
	
	@Autowired
	private UserScanDao userScanDao;
	
	public void add(){
		System.out.println("UserScanService.........");
		userScanDao.add();
	}

}
