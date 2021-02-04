package com.testNG.concepts;

import org.testng.annotations.Test;

public class PriorityAttribute {
	
	@Test(priority=2)
	public void test1() {
		System.out.println("I am priority 2 test");
	}
	 @Test(priority=0) 
	 public void test2() {
	 System.out.println("I am priority 0 test"); }
	  
	  @Test(priority=-1) public void test3() {
	  System.out.println("I am priority -1 test"); }
	  
	  @Test(priority=1) public void test4() {
	  System.out.println("I am priority 1 test"); }
	 

}
