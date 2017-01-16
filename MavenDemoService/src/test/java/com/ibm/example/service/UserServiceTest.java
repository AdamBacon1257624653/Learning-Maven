package com.ibm.example.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;

import com.ibm.example.dao.IUserDao;
import com.ibm.example.model.User;
import com.ibm.example.service.IUserService;
import com.ibm.example.service.UserService;
import com.ibm.example.util.EntitiesHelper;

public class UserServiceTest {
	private IUserDao dao;
	private IUserService service;
	private User baseUser;
	private Integer id = 21;

	@Before
	public void setUp() {
		dao = createNiceMock(IUserDao.class);
		service = new UserService();
		baseUser = new User("Johnson", 11);
		baseUser.setId(id);
	}

	@Test
	public void testAdd() {
		dao.save(baseUser);
		expectLastCall().anyTimes();
		replay(dao);
		service.add(baseUser);
	}

	@Test
	public void testLoadUserByUserId() {
		expect(dao.getById(id)).andReturn(baseUser).anyTimes();
		replay(dao);
		User tUser = service.loadUserByUserId(id);
		EntitiesHelper.assertUser(baseUser, tUser);
	}

	@After
	public void teardown() {
		verify(dao);
	}
}
