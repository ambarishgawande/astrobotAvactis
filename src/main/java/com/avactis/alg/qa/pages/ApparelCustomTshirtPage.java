package com.avactis.alg.qa.pages;

import org.openqa.selenium.By;
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
	WebElement clickOnCustomTshirtChooseFileBtn;
	
	@FindBy (xpath = "//textarea[@name='po[20][val]']")
	WebElement commentOnTshirtText;
	
	@FindBy (xpath = "//input[@type='submit' and @value='Add To Cart']")
	WebElement clickOnCustomTshirtAddToCard;

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
		clickOnCustomTshirtChooseFileBtn.sendKeys(path+fileName);
		return true;
	}
	
	public void selectSize(String val) {
		driver.findElement(By.xpath("//select[@name='po[18]']//option[@value='"+val+"']")).click();
	}
	
	public void enterCommentText(String val) {
		commentOnTshirtText.clear();
		commentOnTshirtText.sendKeys(val);
	}
	
	public void setQuantity(String qty) {
		driver.findElement(By.xpath("//select[@name='quantity_in_cart']//option[@value='"+qty+"']")).click();
	}
	
	public void AddCustomTshirtToCard() {
		clickOnCustomTshirtAddToCard.click();
	}
	
//	public String get
}
