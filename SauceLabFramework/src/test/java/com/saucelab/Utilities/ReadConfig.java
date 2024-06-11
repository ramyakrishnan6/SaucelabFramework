package com.saucelab.Utilities;


import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;

//import org.openqa.selenium.WebDriver;

public class ReadConfig {
	 
	 Properties prop;
			
	
	String Filepath="D:\\dc\\SauceLabFramework\\Configure\\Config.properties";
	
    public  ReadConfig()
    {
    	prop=new Properties();
        	
    	try {
    		
			FileInputStream fis=new FileInputStream(Filepath);
			prop.load(fis);
		} catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
    }
    	
    public String getBaseurl()
    {
    	String urlValue=prop.getProperty("URL");
		
    	    	//check if value  is not null
   	if(urlValue!=null)
   	
	return urlValue;
  	else
 		throw new RuntimeException("URL value not in configuration file");
    }
    
    public String getBrowser() 
    {
    	String browserValue=prop.getProperty("browser");
		
    	//check if value is not null
    	if(browserValue!=null)
       	
   		return browserValue;
        	else
          throw new RuntimeException("Browser value not in configuration file");
        }
    
    }
    
   
