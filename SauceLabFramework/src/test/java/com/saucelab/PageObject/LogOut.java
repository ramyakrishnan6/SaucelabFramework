package com.saucelab.PageObject;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import org.openqa.selenium.WebDriver;
	public class LogOut {
	WebDriver driver;
	public LogOut(WebDriver driver){
	this.driver =driver;
	PageFactory.initElements (driver, this);
	
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement OpenMenu;
	
	@FindBy(xpath=" //a[@id='logout_sidebar_link']")
	WebElement Logout;
	
	public void openmenuicon()
	{
		OpenMenu.click();
	}
	public void clicklogoutbutton()
	{
		
	
	Logout.click();;
	}
	
	
}
