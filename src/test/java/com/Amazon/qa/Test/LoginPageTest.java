package com.Amazon.qa.Test;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.qa.Pages.BasePage;
import com.Amazon.qa.Pages.LoginPage;

public class LoginPageTest extends BasePage {
	
	LoginPage loginPage;
	
	public LoginPageTest() throws IOException {
	super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String amazonTile = loginPage.loginPageTitle();
		Assert.assertEquals(amazonTile, "Amazon Sign In");
	}
		
	@Test(priority=2)
		public void loginPageLogo() {
			Boolean flag = loginPage.loginPageLogo();
			Assert.assertTrue(flag);
				}
	@Test(priority=3)
	public void loginTest() {
	 loginPage.loginInToApp();
	 
	}
	@Test(priority=4)
	public void helpLinkTest() {
		Boolean title = loginPage.helpLink();
		Assert.assertTrue(title);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
