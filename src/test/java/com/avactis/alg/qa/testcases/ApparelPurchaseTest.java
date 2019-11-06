package com.avactis.alg.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.avactis.alg.qa.base.ProjectBase;
import com.avactis.alg.qa.pages.ApparelCustomTshirtPage;
import com.avactis.alg.qa.pages.ApparelPage;
import com.avactis.alg.qa.pages.HomePage;
import com.avactis.alg.qa.pages.LoginPage;
import com.avactis.alg.qa.util.TestUtil;

public class ApparelPurchaseTest extends ProjectBase {

	LoginPage loginPage;
	HomePage homePage;
	ApparelPage apparelPage;
	ApparelCustomTshirtPage apparelCustomTshirtPage;

	public ApparelPurchaseTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		initializationOfBrowser("userUrl");
		loginPage = new LoginPage();
		homePage = new HomePage();
		apparelPage = new ApparelPage();
		apparelCustomTshirtPage = new ApparelCustomTshirtPage();

		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("userPassword"));

		// Before Adding anything to card :
		Assert.assertEquals(homePage.getCardInfoCount(), "0 items", "Item count in card is not equals to 0");
		Assert.assertEquals(homePage.getCardInfoValue(), "$0.00", "Cost of item in card is not equals to $0.00");
	}

	@Test
	public void CustomTshirtPurchaseTest() {
		// After Login -> check you are on Home-Page.
		Assert.assertTrue(homePage.verifyUserName("Ambarish"), "Ambarish is not current user");

		// click on Apparel Link
		apparelPage = homePage.clickOnApparelLink();

		// After clicking on Apparel Link --> check you are landed on Apparel link.
		Assert.assertEquals(TestUtil.getCurrentPageTitle(), "Apparel - Avactis Demo Store",
				"Apparel page title not match");

		// click on "Custom t-shirt
		apparelCustomTshirtPage = apparelPage.clickOnCustomTshirtLink();

		// Now check the page title is : Custom T-Shirt - Upload your own design - Avactis Demo Store
		Assert.assertEquals(TestUtil.getCurrentPageTitle(),
				"Custom T-Shirt - Upload your own design - Avactis Demo Store",
				"Custom T-Shirt page title not match");
		
		apparelCustomTshirtPage.clickOnChooseFile("C:\\Users\\AstrobotHP\\Pictures\\", "ambarish.jpg");
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='po[19]']")).getAttribute("value").contains("ambarish.jpg"));
		apparelCustomTshirtPage.selectSize("S");
		apparelCustomTshirtPage.enterCommentText("Ambarish : World of Test - Automation");
		apparelCustomTshirtPage.setQuantity("2");
		apparelCustomTshirtPage.clickAddToCard();
		apparelCustomTshirtPage.waitTillItemAdded();
	}

	@AfterTest
	public void afterTest() {
		Assert.assertEquals(homePage.getCardInfoCount(), "2 items", "Item count in card is not equals to 1");
		Assert.assertEquals(homePage.getCardInfoValue(), "$51.98", "Cost of item in card is not equals to $51.98");
		driver.quit();
	}

}
