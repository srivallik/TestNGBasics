package com.softAssert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void softAssertion() {
	
		SoftAssert sa=new SoftAssert();
		System.out.println("Soft Assert method was started");
		//sa.assertTrue(false);
		System.out.println("Soft Assert method was executed");
		
	}
	
	@Test
	public void hardAssertion() {
		System.out.println("Hard Assert method was started");
		Assert.assertTrue(false);
		System.out.println("Hard Assert method was executed");
	}

}
