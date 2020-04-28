package com.wallethub.testCases;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.wallethub.pageObjects.BaseClass;
import com.wallethub.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		logger.info("URL is opened");
		driver.get(baseURL);
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		logger.info("Able to login successfully on Facebook");
		
		try { // Check the presence of alert
			   Alert alert = driver.switchTo().alert();

			   // if present consume the alert
			   alert.accept();

			  } catch (NoAlertPresentException ex) {
			     //code to do if not exist.
			  }
		
		Thread.sleep(1000);
		
		
		if(driver.getTitle().equals("Facebook"))
		{
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//*[@name='xhpc_message']")).sendKeys("Hello World");
			WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Post']"))).click();
	        logger.info("Successfully able to Post the message");
		}
		else
		{
			Assert.assertTrue(false);
		}
}
}
