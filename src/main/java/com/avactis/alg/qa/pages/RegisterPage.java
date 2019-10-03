package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	@FindBy (xpath ="//a[text()=\"Register\"]")
	WebElement btnRegister;
	
	public RegisterPage() {
		
	}
	

}
