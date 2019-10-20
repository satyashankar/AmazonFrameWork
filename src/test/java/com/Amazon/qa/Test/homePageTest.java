package com.Amazon.qa.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.qa.Pages.BasePage;
import com.Amazon.qa.Pages.HomePage;
import com.Amazon.qa.Pages.LoginPage;
import com.Amazon.qa.Pages.OrderPage;

public class homePageTest extends BasePage {
	
	LoginPage loginPage;
	HomePage homePage; 
	
	public homePageTest() {
		
	}
	@BeforeMethod
	public HomePage setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage =loginPage.loginInToApp();
		
		return new HomePage();
	
	}
	
	@Test(priority=1)
	public void homePageTitileTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		
		Assert.assertEquals(homePageTitle, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	System.out.println(homePageTitle);
	}
	
	@Test(priority=2)
	public void oderPagetTest() {
		HomePage.clickOnOrderPage();
	}
		
		
		@Test(priority=3)
		public void cartPageTest() {
	    HomePage.clickOnCartPage();
		}
	    
	    @Test(priority=4)
	    public void verifyLableTest() {
	    	Assert.assertTrue(HomePage.verifyLableText(), "text lable is missing");
	    
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

	
	

}
