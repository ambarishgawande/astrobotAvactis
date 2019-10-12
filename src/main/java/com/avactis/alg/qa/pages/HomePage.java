package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.alg.qa.base.ProjectBase;

public class HomePage extends ProjectBase {
	
	// Object Repo :
	@FindBy (xpath = "//span[contains(text(), 'Welcome,')]")
	WebElement welcomeText;
	
	@FindBy (xpath = "//span[contains(text(), 'Ambarish')]")
	WebElement usernameText;
	
	@FindBy (xpath = "//div[@class='header-navigation']//a[contains(text(), 'Apparel')]")
	WebElement apparelLinkTop;
	
	@FindBy (xpath = "//a[text()='Apparel']//i[@class='cat_space']")
	WebElement apparelLinkLeft;
	
	@FindBy (xpath = "//h3//a[text()='Apparel']")
	WebElement apparelLinkMain;
	
	
	// Initializing the Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions:
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyWelcomeText() {
		return welcomeText.isDisplayed();
	}
	
	public boolean verifyUserName() {
		return usernameText.isDisplayed();
	}
	
	public ApparelPage clickOnApparelLink() {
//		apparelLink.click();
		apparelLinkMain.click();
		
		return new ApparelPage();
	}
	
}
