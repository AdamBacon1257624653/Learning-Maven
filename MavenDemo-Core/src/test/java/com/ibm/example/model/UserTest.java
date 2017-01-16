package com.ibm.example.model;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.example.util.AbstractDbUnitTestCase;

public class UserTest {

	@Test
	public void fun() {
		try {
			AbstractDbUnitTestCase.init();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(0, 0);
	}
}
