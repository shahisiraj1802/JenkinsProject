package com.automation.SampleTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngDemo {
// sample code
//	 @Test
//	    public void firstTest() {
//
//	        System.out.println("My First TestNG Program");
//}
	//multiple testcases
//	@Test
//    public void loginTest() {
//        System.out.println("Login Test Executed"); //test case 1
//    }
//
//    @Test
//    public void searchTest() {
//        System.out.println("Search Test Executed"); //test case 2
//    }
//
//    @Test
//    public void logoutTest() {
//        System.out.println("Logout Test Executed"); //test case3
//    }
	
	//priority
	
//	@Test(priority = 1)
//    public void loginTest() {
//        System.out.println("Login Test Executed");
//    }
//
//    @Test(priority = 2)
//    public void searchTest() {
//        System.out.println("Search Test Executed");
//    }
//
//    @Test(priority = 3)
//    public void logoutTest() {
//        System.out.println("Logout Test Executed");
//    }
//	usage of beforeMethod and AfterMethod
//	 @BeforeMethod
//	    public void setup() {
//	        System.out.println("Before Test Execution");
//	    }
//
//	    @Test
//	    public void loginTest() {
//	        System.out.println("Login Test Executed");
//	    }
//
//	    @Test
//	    public void searchTest() {
//	        System.out.println("Search Test Executed");
//	    }
//
//	    @AfterMethod
//	    public void tearDown() {
//	        System.out.println("After Test Execution");
//	    }
	// usage of Beforeclass and AfterClass
	 @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class Execution");
	    }


	    @Test
	    public void loginTest() {
	        System.out.println("Login Test Executed");
	    }


	    @Test
	    public void searchTest() {
	        System.out.println("Search Test Executed");
	    }


	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class Execution");
	    }
}
