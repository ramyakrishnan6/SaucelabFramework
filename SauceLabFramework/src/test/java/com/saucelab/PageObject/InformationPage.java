package com.saucelab.PageObject;



	 import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	

	public class InformationPage  {
		
		
		 WebDriver driver;
		 
		 //create webDriver object
		
		public InformationPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		
	
		//define webElements
	
	
		@FindBy(id="first-name")
		WebElement firstname;
		
		@FindBy(id="last-name")
		WebElement lastname;
		
		@FindBy(id="postal-code")
		WebElement postalcode;
		
		@FindBy(id="continue")
		WebElement continuebutton;
		
		public void enterfirstname()
		{
			firstname.sendKeys("Fname");
		}
		
		public void enterlastname()
		{
			lastname.sendKeys("Lname");
		}
		
		public void enterpostalcode()
		{
			postalcode.sendKeys("567845");
		}
	  public void continuesubmit()
	   {
		   continuebutton.click();
	   }
	
	}
	
	
	
