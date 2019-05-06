package com.bjpowernode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjpowernode.dao.AddUserDao;
import com.bjpowernode.doamin.User;
import com.bjpowernode.service.UserService;


@Service
public class StudentServiceImpl implements UserService{

	@Autowired
	private AddUserDao adduserDao;
	

	@Override
	public Integer addUser(String username, String password) {
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		Integer number = adduserDao.addUser(user);
		
		return number;
	}

	
	
}
