package com.avactis.alg.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.alg.qa.base.ProjectBase;
import com.avactis.alg.qa.pages.HomePage;
import com.avactis.alg.qa.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginPageTest extends ProjectBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
  @Test(priority=1)
  public void loginPageTitleTest() {
	  Assert.assertEquals(loginPage.validateLoginPageTitle(), "Avactis Demo Store", "Login page title not match");
  }
  
  @Test(priority=2)
  public void avactisLogImageTest() {
	  Assert.assertTrue(loginPage.validateAvactisLogo());
  }
  
  
  @Test(priority=3)
  public void loginTest() {
	  homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("userPassword"));
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  initializationOfBrowser("userUrl");
//	  initializationOfBrowser("adminUrl");	// if you want to login as admin
	  loginPage = new LoginPage();
	  homePage = new HomePage();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
