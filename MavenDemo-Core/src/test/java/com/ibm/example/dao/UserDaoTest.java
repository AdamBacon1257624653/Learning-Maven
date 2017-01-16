package com.ibm.example.dao;

import org.junit.Before;
import org.junit.Test;

import com.ibm.example.model.User;

public class UserDaoTest {

	UserDao dao = new UserDao();
	
	@Before
	public void setup(){
		System.out.println("before.....");
	}

	@Test
	public void testSave() {
		dao.save(new User("Adam", 12));
	}

	@Test
	public void testGetById() {
		User user = dao.getById(1);
		System.out.println(user);
	}
}
