package com.saucelab.Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.util.*;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import com.saucelab.Utilities.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger logger;      
	ReadConfig readConfig=new ReadConfig();
	String url=readConfig.getBaseurl();
	String browser=readConfig.getBrowser();


@BeforeClass
	
public void setup()
{
 switch(browser.toLowerCase())
 {
case "chrome":
	 driver=new ChromeDriver();
	 break;
 case "firefox":
     driver=new FirefoxDriver();
     break;

 case "edge":
 driver=new EdgeDriver();
break;
	 default:
	 		driver=null;
	 break;
}

driver.manage().window().maximize();
logger= LogManager.getLogger("SauceLabFramework");


 }
//@AfterClass
//public void tearDown()
//{
//	driver.quit();
//}
}

 
 
 
 
 
 



