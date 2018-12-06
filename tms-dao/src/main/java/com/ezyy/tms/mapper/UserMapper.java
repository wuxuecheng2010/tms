package com.ezyy.tms.mapper;

import com.ezyy.tms.entity.User;

public interface UserMapper {
	public User findByUserName(String username);
}
