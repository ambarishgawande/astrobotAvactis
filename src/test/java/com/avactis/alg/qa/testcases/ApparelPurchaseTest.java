package com.avactis.alg.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.avactis.alg.qa.base.ProjectBase;
import com.avactis.alg.qa.pages.ApparelCustomTshirtPage;
import com.avactis.alg.qa.pages.ApparelPage;
import com.avactis.alg.qa.pages.HomePage;
import com.avactis.alg.qa.pages.LoginPage;

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
		  
	}

	@Test
	public void CustomTshirtPurchaseTest() {
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
