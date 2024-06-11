package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.Testcase.BaseClass;

public class LoginPage extends BaseClass {
	
	
	 WebDriver driver;
	 
	 //create webDriver object
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//define webElements
	
		
	@FindBy(id="user-name")
	WebElement Username;
	
	
	@FindBy(id="password")
	WebElement Password;
	
   @FindBy(id="login-button")
   WebElement submitbutton;
   
   
   public void enterusername()
   {
	   Username.sendKeys("standard_user");
   }
   public void enterpassword()
   {
	   Password.sendKeys("secret_sauce");
   }
   
   public void submitButton()
   {
	   submitbutton.click();
   }
 
}
   
     
   













