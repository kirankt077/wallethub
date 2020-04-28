package com.wallethub.pageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public String baseURL="https://www.facebook.com/";
	public String baseURL2 = "https://wallethub.com/join/light";
	public String baseURL3 = "https://wallethub.com/profile/test_insurance_company/";
	public String username="deeptest22@gmail.com";
	public String username2="deeptest22@gmail.com";
	public String password="Jan2009@";
	public String password2="Jan2009@";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void Setup()
	{
        /*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");	
		driver = new FirefoxDriver();
		
		logger = Logger.getLogger("wallethub");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	

}
