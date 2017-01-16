package com.ibm.example.service;

import com.ibm.example.model.User;

public interface IUserService {
	public void add(User user);

	public User loadUserByUserId(Integer id);
}
