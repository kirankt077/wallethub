package com.wallethub.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wallethub.pageObjects.BaseClass;
import com.wallethub.pageObjects.LoginPage;

public class TC_wallethub_review_002 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
	 logger.info("Wallethub website able to access");
	 driver.get(baseURL2);
	 LoginPage lp= new LoginPage(driver);
	 
	 /*driver.findElement(By.xpath("//li//a[contains(text(),'Login')]")).click();*/
	 
	 WebDriverWait wait = new WebDriverWait(driver,30);
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li//a[contains(text(),'Login')]"))).click();
	 
	 lp.setUserName2(username2);
	 lp.setPassword2(password2);
	 lp.clickSubmit2();
	
	 logger.info("Able to login to Wallethub site");
	 driver.get(baseURL3);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//div[@class='review-action ng-enter-element']//*[4]")).click();
	 Thread.sleep(3000);
	 
	 logger.info("Able to review by selecting 4 star");
	 driver.findElement(By.xpath("//span[contains(text(),'Select...')]")).click();
	 driver.findElement(By.xpath("//li[contains(text(),'Health Insurance')]")).click();
	 
	 driver.findElement(By.xpath("//textarea[@placeholder='Write your review...']")).sendKeys("Methods for transferring or distributing risk were practiced by Chinese and Babylonian traders as long ago as the 3rd and 2nd millennia BC, respectively.");;
	 
	 /*driver.findElement(By.xpath("//div[contains(text(),'Submit')]")).click();
	 
	 logger.info("Review Submitted successfully");*/
	 }
	}
