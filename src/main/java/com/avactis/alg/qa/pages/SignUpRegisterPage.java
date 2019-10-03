package com.avactis.alg.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.avactis.alg.qa.base.ProjectBase;

public class SignUpRegisterPage extends ProjectBase {

	@FindBy (xpath = "//button[contains(text(),'Register')]")
	WebElement btnRegister;
	
}
