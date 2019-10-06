package com.avactis.alg.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.alg.qa.base.ProjectBase;
import com.avactis.alg.qa.pages.HomePage;
import com.avactis.alg.qa.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends ProjectBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
  @Test(priority=1)
  public void loginPageTitleTest() {
	  Assert.assertEquals(loginPage.validateLoginPageTitle(), "Avactis Demo Store");
  }
  
  @Test(priority=2)
  public void avactisLogImageTest() {
	  Assert.assertTrue(loginPage.validateAvactisLogo());
  }
  
  
  @Test(priority=3)
  public void loginTest() {
	  homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("userPassword"));
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  initializationOfBrowser();
	  loginPage = new LoginPage();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
