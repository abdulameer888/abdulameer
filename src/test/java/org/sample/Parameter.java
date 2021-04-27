package org.sample;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class Parameter {
	@Test
@Parameters({"UserName","password"}) 
	private void test1(String name,String pass) {
		System.out.println(name);
		System.out.println(pass);
		}
	@Test 
	@Parameters({"name","password"})
	private void test11(@Optional("Technology") String name, String pass) {
		System.out.println(name);
		System.out.println(pass);
		
	}

}
