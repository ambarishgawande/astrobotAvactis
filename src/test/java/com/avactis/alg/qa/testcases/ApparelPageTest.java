package com.avactis.alg.qa.testcases;

import org.testng.annotations.Test;

import com.avactis.alg.qa.base.ProjectBase;
import com.avactis.alg.qa.pages.ApparelPage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ApparelPageTest extends ProjectBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ApparelPage apparelPage;
	
	public ApparelPageTest() {
		super();
	}
	
  @Test(priority=1)
  public void verifyApparelPageTitleTest() {
//	  Assert.assertEquals(apparelPage.verifyApparelPageTitle(), "Apparel - Avactis Demo Store", "Home page title not match");
	  
	  
	  Assert.assertEquals(apparelPage.verifyApparelPageTitle(), "Apparel - Avactis Demo Store");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  initializationOfBrowser("GoToUserPage");
	  loginPage = new LoginPage();
	  homePage = new HomePage();
	  apparelPage = new ApparelPage();
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
