package com.saucelab.PageObject;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import org.openqa.selenium.WebDriver;
	public class OverviewPage {
	WebDriver driver;
	public OverviewPage(WebDriver driver){
	this.driver =driver;
	PageFactory.initElements (driver, this);
	}
	
	@FindBy(id="finish")
    WebElement FinishButton;
	
	public void clickfinishbutton()
	{
		FinishButton.click();
	}
	
	
	}