package com.ibm.example.service;

import com.ibm.example.dao.IUserDao;
import com.ibm.example.dao.UserDao;
import com.ibm.example.model.User;

public class UserService implements IUserService {
	IUserDao dao = new UserDao();

	public void add(User user) {
		dao.save(user);
	}

	public User loadUserByUserId(Integer id) {
		return dao.getById(id);
	}

}
