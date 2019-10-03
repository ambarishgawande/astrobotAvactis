package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.alg.qa.base.ProjectBase;

public class LoginPage extends ProjectBase {
	
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
	
	public LoginPage() {
		
	}

}
