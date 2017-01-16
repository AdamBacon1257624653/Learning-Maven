package com.ibm.example.dao;

import com.ibm.example.model.User;

public interface IUserDao {
	public void save(User user);

	public User getById(Integer id);
}
