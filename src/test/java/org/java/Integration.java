package org.java;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Integration extends BaseClass {
	public static void main(String[] args) {
		BaseClass base = new BaseClass ();
		base.getDriver();
		base.launchurl("https://www.facebook.com/");
	WebElement txtname = driver.findElement(By.id("email"));
	base.entertext(txtname, "java");
	WebElement txtpass = driver.findElement(By.id("pass"));
	base.entertext(txtpass, "welcomes you");
	WebElement btnlick = driver.findElement(By.name("login"));
	base.btnclick(btnlick);
	}

}
