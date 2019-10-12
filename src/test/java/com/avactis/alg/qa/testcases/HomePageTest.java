package com.avactis.alg.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.alg.qa.base.ProjectBase;
import com.avactis.alg.qa.pages.ApparelPage;
import com.avactis.alg.qa.pages.HomePage;
import com.avactis.alg.qa.pages.LoginPage;

import org.testng.annotations.BeforeClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class HomePageTest extends ProjectBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ApparelPage apparelPage;
	
	public HomePageTest() {
		super();
	}
	
  @Test(priority=1)
  public void verifyHomePageTitleTest() {
	  
	  Assert.assertEquals(homePage.verifyHomePageTitle(), "Avactis Demo Store", "Home page title not match");
  }
  
  @Test(priority=2)
  public void verifyWelcomeTextTest() {
//	  Assert.assertTrue(homePage.verifyWelcomeText(), "Welcome text not match");
//	  Assert.assertFalse(homePage.verifyWelcomeText(), "Welcome text not match");
  }
  
  @Test(priority=3)
  public void verifyUserNameTest() {
	  Assert.assertTrue(homePage.verifyUserName(), "User Name not match");
  }
  
  @Test(priority=4)
  public void goToapparelPage() {
	  homePage.clickOnApparelLink();
  }
  
  @BeforeClass
  public void beforeClass() {
	  homePage = new HomePage();
	  
  }

  @AfterClass
  public void afterClass() {
//	  driver.quit();
  }

}
