package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.alg.qa.base.ProjectBase;

public class LoginPage extends ProjectBase {
	
	// Page Factory or OB (Object repository)
	
	// UserName
	@FindBy (xpath = "//input[@id='sign_in_box_email']")
	WebElement inputUserName;
	
	// Password
	@FindBy (xpath = "//input[@id='sign_in_box_password']")
	WebElement inputUserPassword;
	
	// Remember Me Check Box
	@FindBy (xpath = "//input[@name='remember_me']")
	WebElement checkBoxRememberMe;			//alternet xPath : "//input[@value='save']"
	
	// Submit button
	@FindBy (xpath ="//input[@type='submit']")
	WebElement btnSubmit;
	
	// Avactis Logo
	@FindBy (xpath = "//a[@class='site-logo']")
	WebElement avactisLogo;
	
	// Initializing the Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions :
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateAvactisLogo() {
		return avactisLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		inputUserName.clear();
		inputUserName.sendKeys(un);
		
		inputUserPassword.clear();
		inputUserPassword.sendKeys(pwd);
		
		if (checkBoxRememberMe.isSelected() ) {
			checkBoxRememberMe.click();
		}
		
		btnSubmit.click();
		
		return new HomePage();
	}
}
