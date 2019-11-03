package com.avactis.alg.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avactis.alg.qa.base.ProjectBase;

public class HomePage extends ProjectBase {

	// Object Repo :
	@FindBy(xpath = "//span[contains(text(), 'Welcome,')]")
	WebElement welcomeText;

	@FindBy(xpath = "//span[contains(text(), 'Ambarish')]")
	WebElement usernameText;

	@FindBy(xpath = "//div[@class='header-navigation']//a[contains(text(), 'Apparel')]")
	WebElement apparelLinkTop;

	@FindBy(xpath = "//a[text()='Apparel']//i[@class='cat_space']")
	WebElement apparelLinkLeft;

	@FindBy(xpath = "//h3//a[text()='Apparel']")
	WebElement apparelLinkMain;

	@FindBy(xpath = "//a[@class='top-cart-info-count']")
	WebElement topCardInfoCount;

	@FindBy(xpath = "//a[@class='top-cart-info-value']")
	WebElement topCardInfoValue;

	// Initializing the Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyWelcomeText() {
		return welcomeText.isDisplayed();
	}

	public boolean verifyUserName() {
		return usernameText.isDisplayed();
	}

	public boolean verifyUserName(String un) {
		return (driver.findElement(By.xpath("//span[contains(text(), '" + un + "')]")).isDisplayed());
	}

	public String getCardInfoCount() {
		return (topCardInfoCount.getText());
	}

	public String getCardInfoValue() {
		return (topCardInfoValue.getText());
	}

	public boolean checkCardInfoCount(String count) {
		return (driver.findElement(By.xpath("//a[@class='top-cart-info-count' and text()='" + count + " items']"))
				.isDisplayed());
	}

	public boolean checkCardInfoValue(String cost) {
		return (driver.findElement(By.xpath("//a[@class='top-cart-info-value' and text()='$" + cost + "']"))
				.isDisplayed());
	}

	public ApparelPage clickOnApparelLink() {
		// apparelLink.click();
		apparelLinkMain.click();

		return new ApparelPage();
	}

}
