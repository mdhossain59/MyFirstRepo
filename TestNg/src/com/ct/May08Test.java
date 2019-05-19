package com.ct;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class May08Test {
	
	//This is to Test our Github Repo
  
	@Test
  public void TestCase01() {
		System.out.println("Executing Test Case 01");
  }
	
	@Test(enabled=false)
	public void TestCase02() {
		System.out.println("Executing Test Case 02");
		Assert.assertEquals(true, true);
		System.out.println("This a Test");
	}
	
	@Test
	public void TestCase03() {
		System.out.println("Executing Test Case 03");
		Assert.assertEquals(150, 170);
		
	}
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Broser opening ................................");
	  
  }

  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close Browser xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  }
  
  @Test
  public void validateGithub() {
	  System.out.println("This will validate Github");
  }

}
