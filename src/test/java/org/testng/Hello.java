package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hello {
	@BeforeClass
	private void beforeclass() {
		System.out.println("before class");
		}
	@AfterClass
	private void afterclass() {
		System.out.println("after class");

	}
	@Test
	private void test1() {
		System.out.println("test1");
		}
	@BeforeMethod
	private void beforemethod() {
		 System.out.println("before method");
		 }
	@AfterMethod
	private void aftermethod() { 
		System.out.println("after method");
}

}
