package org.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static final String data = null;
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchurl(String data) {
		driver.get(data);
	}
	public void entertext(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void btnclick(WebElement element) {
	element.click();

	}
	public void movetoelement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		
		
	}
	public void entertextbyjs(String data, WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js .executeScript("argument[0].setattribute('value','data')",element);

	}

}
