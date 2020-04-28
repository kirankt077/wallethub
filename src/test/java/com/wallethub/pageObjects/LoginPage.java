package com.wallethub.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}

//	For Facebook 
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="pass")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="u_0_b")
	@CacheLookup
	WebElement btnLogin;
	
	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
//	For wallethub
	
	@FindBy(name="em")
	@CacheLookup
	WebElement txtUsername2;
	
	@FindBy(name="pw1")
	@CacheLookup
	WebElement txtPassword2;
	
	@FindBy(xpath="//button[@class='btn blue touch-element-cl' and @type='button']")
	@CacheLookup
	WebElement btnLogin2;
	
	public void setUserName2(String uname)
	{
		txtUsername2.sendKeys(uname);
	}
	
	public void setPassword2(String pwd)
	{
		txtPassword2.sendKeys(pwd);
	}
	
	public void clickSubmit2()
	{
		btnLogin2.click();
	}
	
	
	
}
