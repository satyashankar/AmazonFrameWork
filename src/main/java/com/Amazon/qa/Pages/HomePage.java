package com.Amazon.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	//PageFactory 
	@FindBy(xpath="//span[@class='nav-line-2'][contains(text(),'Orders')]")
	static
	WebElement orderPage;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	static
	WebElement cartPage;
	
	@FindBy(xpath="//h2[contains(text(),'Hi, SATHISH')]")
	static
	WebElement textLable;
	
	//initializing pagefactory elements
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public static  OrderPage clickOnOrderPage() {
		orderPage.click();
	 return new OrderPage();
	}
	
	public static cartPage clickOnCartPage() {
	    cartPage.click();
	    return new cartPage();
	}
	
	public static Boolean verifyLableText() {
		return textLable.isDisplayed();
	}
		
	

}
