package com.cn.dao;

import org.springframework.stereotype.Repository;

import com.cn.dto.User;


@Repository("userDaoI")
public class UserDaoImpl implements UserDaoI{
	
	@Override
	public User findUser() {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(1);
		user.setName("roc");
		user.setAge(22);
		return user;
	}
	

}
