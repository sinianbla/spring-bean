package com.sinianbla.service;

import org.springframework.stereotype.Service;

import com.sinianbla.dao.UserDao;

@Service
public class UserService {
	

	public void add(){
		System.out.println("service.........");
		UserDao userDao = new UserDao();
		userDao.add();
	}
}
