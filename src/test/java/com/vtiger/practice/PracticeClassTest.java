package com.vtiger.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeClassTest 
{

	@Test
	public void practiceMethodTest()
	{
		Reporter.log("testNg practice class",true);
		String name="raji";
		Assert.assertEquals(name, "raji");
		Reporter.log("test case is passed",true);
	}
}
