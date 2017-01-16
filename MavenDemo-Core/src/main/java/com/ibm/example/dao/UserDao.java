package com.ibm.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibm.example.model.User;
import com.ibm.example.util.SessionUtils;

public class UserDao implements IUserDao {
	/**
	 * 插入用户
	 * 
	 * @param user
	 */
	public void save(User user) {
		Session session = SessionUtils.getsSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			throw e;
		} finally {
			session.close();
		}
	}

	/**
	 * 查询用户信息
	 * 
	 * @param user
	 */
	public User getById(Integer id) {
		Session session = SessionUtils.getsSession();
		User user = null;
		try {
			Transaction transaction = session.beginTransaction();
			user = (User) session.get(User.class, id);
			transaction.commit();
			return user;
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			throw e;
		} finally {
			session.close();
		}

	}
}
