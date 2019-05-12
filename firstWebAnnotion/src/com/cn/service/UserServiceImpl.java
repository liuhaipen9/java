package com.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.dao.UserDaoI;
import com.cn.dto.User;

@Service("userServiceI")
public class UserServiceImpl implements UserServiceI{
	
	@Autowired
	private UserDaoI userDaoI;
	
	@Override
	public User findUser() {
		// TODO Auto-generated method stub
		return userDaoI.findUser();
	}
 
}
