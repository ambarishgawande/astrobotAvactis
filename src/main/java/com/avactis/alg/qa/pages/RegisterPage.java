package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.alg.qa.base.ProjectBase;

public class RegisterPage extends ProjectBase {
	
	@FindBy (xpath ="//a[text()=\"Register\"]")
	WebElement btnRegister;
	
	public RegisterPage() {
		
	}
	

}
