package com.selenium.kenandy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = Configuration.searchField)
	public WebElement searchField;

	@FindBy(xpath = Configuration.searchButton)
	public WebElement searchButton;

	public SearchPage enterSearchField() {
		searchField.sendKeys("apple watch");
		return PageFactory.initElements(driver, SearchPage.class);
	}

	public SelectCategoryPage clickSearchButton() {
		searchButton.click();
		return PageFactory.initElements(driver, SelectCategoryPage.class);
	}
}
