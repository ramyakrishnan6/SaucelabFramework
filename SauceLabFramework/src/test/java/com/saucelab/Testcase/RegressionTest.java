package com.saucelab.Testcase;
   import com.saucelab.PageObject.CartPage;
import com.saucelab.PageObject.CompletePage;
import com.saucelab.PageObject.InformationPage;
import com.saucelab.PageObject.LoginPage;
import com.saucelab.PageObject.OverviewPage;
import com.saucelab.PageObject.ProductPage;
import com.saucelab.PageObject.LogOut;

	import org.testng.annotations.Test;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
	import org.testng.annotations.Test;


	public class RegressionTest extends BaseClass{
	@Test
	public void verifyLoginPageFunctionality(){
	driver.get(url);
	LoginPage lp=new LoginPage(driver);
	lp.enterusername();
	lp.enterpassword();
	lp.submitButton();
	
	String title = driver.getTitle();
	
	 System.out.println("Login page title is : "+ title);
	       if(title.equals("Swag Labs"))
	       {
	 logger.info("Login title verification passed.");
	 Assert.assertTrue(true);
	 System.out.println("Login Page Test Cases Passed.");
	    }
	 else 
	 {
		 logger.info("Login title verification failed.");
	     captureScreenShot(driver,"Verify Login Title");
	  Assert.assertTrue(false);
	   System.out.println("Login Page Test Cases Failed.");
	   }	
	       
	       //Product page creation
	      // System.out.println("Creating ProductPage object...");
           ProductPage prodPage = new ProductPage(driver);
         //  System.out.println("Clicking on product link...");
           prodPage.clickOnProductLink();
       //    System.out.println("Clicking on add to cart button...");
           prodPage.clickOnAddToCartButton();
           String productUrl = driver.getCurrentUrl();
           System.out.println("Product page URL is: " + productUrl);
           if (!productUrl.equals("https://www.saucedemo.com/inventory-item.html?id=4"))
           {
               System.out.println("Product Page Test Cases Failed.");
               Assert.assertTrue(false);
           } else {
               System.out.println(" ProductPage Test Cases Passed.");
               Assert.assertTrue(true);
           }
           
           //cart page
         //  System.out.println("Creating cartpage object...");
           CartPage cartpage = new CartPage(driver);
          // System.out.println("Clicking on cart link...");
           cartpage.clickOnCartIcon();
        //   System.out.println("Clicking on checkout button...");
            cartpage.clickOncheckOutBtn();
            String Infopageurl = driver.getCurrentUrl();
            System.out.println("InfopageURL is: " + Infopageurl);
            if (!Infopageurl.equals("https://www.saucedemo.com/checkout-step-one.html"))
            {
                System.out.println("cartpage Test Cases Failed.");
                Assert.assertTrue(false);
            } else {
                System.out.println("cartpage Test Cases Passed.");
                Assert.assertTrue(true);
            }
           
           //Informationpageurl
           // System.out.println("Creating InformationPage object...");
            InformationPage ipage = new InformationPage(driver);
           // System.out.println("Enter first name.....>");
           ipage.enterfirstname();
          // System.out.println("Enter Last name.....>");
           ipage.enterlastname();
          // System.out.println("Enter postalcode.....>");
    		ipage.enterpostalcode();
         ipage.continuesubmit();
         String overviewurl=driver.getCurrentUrl();
            System.out.println("overvieweurl is: "+ overviewurl);
            if (!overviewurl.equals("https://www.saucedemo.com/checkout-step-two.html"))
            {
                System.out.println("Informationpage Test Cases Failed.");
                Assert.assertTrue(false);
            } else {
                System.out.println("Informationpage Test Cases Passed.");
                Assert.assertTrue(true);
            }
          
          //OverviewPageurl
          //  System.out.println("Creating OverviewPage object...");
            OverviewPage opage = new OverviewPage(driver);
            opage.clickfinishbutton();
           String ordercompleteurl=driver.getCurrentUrl();
           System.out.println("ordercompletepageurl is: "+ ordercompleteurl);
           if (!ordercompleteurl.equals("https://www.saucedemo.com/checkout-complete.html"))
           {
               System.out.println("overview Test Cases Failed.");
               Assert.assertTrue(false);
           } else {
               System.out.println("overview Test Cases Passed.");
               Assert.assertTrue(true);
           }
           
        // Create and use CompletePage object
           System.out.println("Creating CompletePage object...");
           CompletePage completePage = new CompletePage(driver);
           completePage.getSuccessMsg();
     
           
           //Logoutpage functionality
           
           LogOut logout=new LogOut(driver);
           logout.openmenuicon();
           logout.clicklogoutbutton();
           String LoginPageurl=driver.getCurrentUrl();
           System.out.println("LoginPageUrl is: "+ LoginPageurl );
           if (!LoginPageurl.equals("https://www.saucedemo.com/"))
           {
               System.out.println("Logout Test Cases Failed.");
               Assert.assertTrue(false);
           } else {
               System.out.println("Logout Test Cases Passed.");
               Assert.assertTrue(true);
           }
           
         
           
           
	}

	private void captureScreenShot(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}}
  
	       
	      
	