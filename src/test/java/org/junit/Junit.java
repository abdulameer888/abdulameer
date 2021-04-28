package org.junit;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit { 
	static WebDriver driver ;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\JavaProject\\Driver\\chromedriver.exe" );
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void aftermethod() {
		driver.quit();

	}

	@Before
	public  void beforemethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@After
	public   void Aftermethod() {
		Date date = new Date();
		System.out.println(date);


	}
	@Test
	public void test1() throws InterruptedException {
		WebElement txtname = driver.findElement(By.id("email"));
		txtname.sendKeys(" abdul ameer");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("23123456456");
		Thread.sleep(2000);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click(); 
	}
}


