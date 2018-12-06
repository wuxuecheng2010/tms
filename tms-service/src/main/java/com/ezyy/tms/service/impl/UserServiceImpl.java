package com.ezyy.tms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezyy.tms.entity.User;
import com.ezyy.tms.mapper.UserMapper;
import com.ezyy.tms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userMapper.findByUserName(username);
	}

}
