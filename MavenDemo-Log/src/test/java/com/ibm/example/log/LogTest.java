package com.ibm.example.log;

import org.junit.Assert;
import org.junit.Test;

public class LogTest {

	@Test
	public void testFun() {
		Log log = new Log();
		Assert.assertEquals(log.fun(), 1);
	}
}
