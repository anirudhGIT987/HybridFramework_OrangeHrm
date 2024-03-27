package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Utilities.log;



//import com.Utilities.LogUtility;

public class BaseTest {
	
	public static WebDriver driver;
	String webApplicationUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\SaS@m\\AUT_Projects\\Ohrm_VersionL\\BrowserDrivers\\chromedriver.exe");		
		driver = new ChromeDriver();
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
log.info("********* Chrome Browser Launched Successfully ******** ");
		driver.get(webApplicationUrl);
//log.info("Successfully Navigated to OrangeHRM Application ");
	}
	/*
	@AfterTest
	public void tearDown() {
		driver.quit();
log.info(" **** Chorme Browser Closed with the OrangeHRM Application Successfully *******");		
	}
	*/
}
