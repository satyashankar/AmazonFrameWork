package com.Amazon.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	//PageFactory
	
	@FindBy(id="ap_email")	
	WebElement uname;
	
	@FindBy(id="ap_password")
	WebElement paswd;
	
	@FindBy(id="signInSubmit")
	WebElement SignInBtn;
	
	@FindBy(xpath= "//i[@class='a-icon a-icon-logo']")
	WebElement AmazonLogo;
	
	@FindBy(id="nav-link-accountList")
	WebElement hello;
	
	@FindBy(className="nav-action-inner")
	WebElement btn;
	
	@FindBy(xpath="//a[contains(text(),'Help')]")
	WebElement helpLink;
	
	//initialising the Page objects
	
	public LoginPage() throws InterruptedException{
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		action.moveToElement(hello).build().perform();
		//Thread.sleep(3000);
		

		
		btn.click();
	}
	
	
	
	public String loginPageTitle() {
    	return driver.getTitle();
    }
	
	public boolean loginPageLogo() {
		return AmazonLogo.isDisplayed();
	}
	
	public HomePage loginInToApp(){
		uname.sendKeys("gouds.85@gmail.com");
		paswd.sendKeys("riya2712");
		SignInBtn.click();
		
		return new HomePage();		
		
		
	}
	
	public boolean helpLink() {
		return helpLink.isDisplayed();
	}


}   
    

