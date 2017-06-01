package com.wang.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wang.ssm.been.User;
import com.wang.ssm.dao.UserDao;
import com.wang.ssm.service.UserService;

/**
 * 逻辑实现处理类。
 * @author wangmin
 * @since 2017年6月1日-上午10:22:11
 * @version V1.0
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(User user) throws Exception {
		
	}

	@Override
	public void delete(User user) throws Exception {
		
	}

	@Override
	public User getUserById(int userId) throws Exception {
		User user = userDao.getUserById(userId);
		if (user == null){
			return null;
		}
			
		return user;
	}

	@Override
	public List<User> getUserByAge(int age) throws Exception {
		return null;
	}

}
