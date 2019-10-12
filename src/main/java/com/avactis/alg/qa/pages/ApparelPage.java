package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.alg.qa.base.ProjectBase;

public class ApparelPage extends ProjectBase {
	// Object Repo :
	@FindBy (xpath = "//a//img[@alt='Custom T-Shirt (Upload your own design!)']")
	WebElement customTshirtLink;
	
	@FindBy (xpath = "//a//img[@alt='Avactis T-Shirt']")
	WebElement avactisTshirtLink;
	
	@FindBy (xpath = "//a//img[@alt='Pure cotton T-Shirt']")
	WebElement pureCottonTshirtLink;
	
	@FindBy (xpath = "//h2[text()='Bestsellers']")
	WebElement bestSellersHeading;
	
	
	// Initializing the Page Object :
	public ApparelPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Action:
	public String verifyApparelPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCustomTshirt() {
		return customTshirtLink.isDisplayed();
	}
	
	public boolean verifyAvactisTshirt() {
		return avactisTshirtLink.isDisplayed();
	}
	
	public boolean verifyBestSellersHeading() {
		return bestSellersHeading.isDisplayed();
	}
	
	public ApparelCustomTshirtPage selectCustomApparel() {
		customTshirtLink.click();
		return new ApparelCustomTshirtPage();
	}
	
	public ApparelAvactisTshirtPage selectAvactisTshirt() {
		avactisTshirtLink.click();
		return new ApparelAvactisTshirtPage();
	}

}
