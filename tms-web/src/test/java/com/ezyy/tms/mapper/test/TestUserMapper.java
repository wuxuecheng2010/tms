package com.ezyy.tms.mapper.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ezyy.tms.entity.User;
import com.ezyy.tms.mapper.UserMapper;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class TestUserMapper {
	
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFindByUserName() {
		log.info("test testFindByUserName.....");
		User u=userMapper.findByUserName("admin");
		Assert.assertTrue(u!=null);
	}


}
