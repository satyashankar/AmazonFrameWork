package com.Amazon.qa.Pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.Amazon.qa.Util.TestUtil;
import com.Amazon.qa.Util.WebEventListener;

public class BasePage {
	
	public static WebDriver driver;
	
	
     public static void initialization() { 
    	
      	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\SandeepGoud\\Downloads\\chromedriver.exe");
    		 driver = new ChromeDriver();
    		 
     
	 
    		 
    			EventFiringWebDriver e_driver = new EventFiringWebDriver(driver);

    			// Now create object of EventListerHandler to register it with EventFiringWebDriver
    			WebEventListener eventListener = new WebEventListener();

    			e_driver.register(eventListener);
    			driver = e_driver;
    	 
    	 
    	 driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS); 
 		
 		driver.get("https://www.amazon.ca");
 		
}}
 		


