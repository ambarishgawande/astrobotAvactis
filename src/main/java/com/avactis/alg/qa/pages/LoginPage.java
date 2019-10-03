package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy (xpath = "//a[contains(text(), 'Sign In')]")
	WebElement signIn;
	
	@FindBy (xpath = "//input[@id='account_sign_in_form_email_id']")
	WebElement inputEmail;
	
	@FindBy (xpath = "//input[@id='account_sign_in_form_passwd_id']")
	WebElement inputPassword;
	
	@FindBy (xpath = "//input[@name='remember_me']")
	WebElement checkBoxRemeberMe;
	
	@FindBy (xpath ="//input[@type='submit']")
	WebElement btnSubmit;

}
