package com.ibm.example.util;

import org.junit.Assert;

import com.ibm.example.model.User;

public class EntitiesHelper {

	public static void assertUser(User expected, User actual) {
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected, actual);
	}

}
