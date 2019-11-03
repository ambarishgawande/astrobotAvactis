package com.avactis.alg.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.avactis.alg.qa.base.ProjectBase;
import com.avactis.alg.qa.pages.ApparelCustomTshirtPage;
import com.avactis.alg.qa.pages.ApparelPage;
import com.avactis.alg.qa.pages.HomePage;
import com.avactis.alg.qa.pages.LoginPage;

public class ApparelPageTest extends ProjectBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ApparelPage apparelPage;
	ApparelCustomTshirtPage apparelCustomTshirtPage;
	
	public ApparelPageTest() {
		super();
	}
	
  
  @BeforeMethod
  public void beforeMethod() {
	  initializationOfBrowser("userUrl");
	  loginPage = new LoginPage();
	  homePage = new HomePage();
	  apparelPage = new ApparelPage();
	  apparelCustomTshirtPage = new ApparelCustomTshirtPage();
	  
	  homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("userPassword"));
	  apparelPage = homePage.clickOnApparelLink();			// click on Apparel Link
  }
  
  
  @Test(priority=1)
  public void verifyApparelPageTitleTest() {
//	  Assert.assertEquals(apparelPage.verifyApparelPageTitle(), "Apparel - Avactis Demo Store", "Home page title not match");
	  Assert.assertEquals(apparelPage.verifyApparelPageTitle(), "Apparel - Avactis Demo Store");
  }
  
  @Test(priority=2)
  public void verifyCustomTshirtTest() {
	  Assert.assertTrue(apparelPage.verifyCustomTshirt(), "Custom T-Shirt not present on Apparel Page");
  }
  
  @Test(priority=3)
  public void verifyAvactisTshirtTest() {
	  Assert.assertTrue(apparelPage.verifyAvactisTshirt(), "Avactis T-Shirt not present on Apparel Page");
  }
  
  @Test(priority=4)
  public void verifyBestSellersHeadingTest() {
	  Assert.assertTrue(apparelPage.verifyBestSellersHeading(), "Best Seller Heading not present on Apparel Page");
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
