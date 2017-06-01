package com.wang.ssm.dao;

import java.util.List;

import com.wang.ssm.been.User;

public interface UserDao {

	/**
	 * 添加用户。
	 * @param user
	 * @throws Exception
	 */
	public void save(User user) throws Exception;
	/**
	 * 删除用户。
	 * @param user
	 * @throws Exception
	 */
	public void delete(User user) throws Exception;
	/**
	 * 根据用户ID获取用户。
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public User getUserById(int userId) throws Exception;
	/**
	 * 根据年龄获取用户。
	 * @param age
	 * @return
	 * @throws Exception
	 */
	public List<User> getUserByAge(int age) throws Exception;
}
