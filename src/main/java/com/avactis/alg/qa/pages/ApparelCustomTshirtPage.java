package com.avactis.alg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.avactis.alg.qa.base.ProjectBase;

public class ApparelCustomTshirtPage extends ProjectBase {

	// Object Repo:
	@FindBy(xpath = "//h1[text() = 'Custom T-Shirt (Upload your own design!)']")
	WebElement CustomTshirtHeading;

	@FindBy(xpath = "//strong[@class='product_sale_price' and contains(text(), '$25.99')]")
	WebElement CustomTshirtCost;
	
	@FindBy (xpath = "//input[@name='po[19]']")
	WebElement CustomTshirtChooseFileBtn;

	// Initializing the Page Object

	// Action
	public String getCustomTshirtPageTitle() {
		return driver.getTitle();
	}
	
	public boolean checkCustomTshirtHeading() {
		return CustomTshirtHeading.isDisplayed();
	}
	
	public boolean checkCustomTshirtCost() {
		return CustomTshirtCost.isDisplayed();
	}
	
	public String getCustomTshirtCost() {
		return CustomTshirtCost.getText();
	}
	
	public boolean uploadDesginFile(String path, String fileName) {
		CustomTshirtChooseFileBtn.sendKeys(path+fileName);
		return true;
	}
}
