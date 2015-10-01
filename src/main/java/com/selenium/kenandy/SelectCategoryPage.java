package com.selenium.kenandy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCategoryPage {
	WebDriver driver;

	public SelectCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = Configuration.selectCategory)
	public WebElement selectCategory;

	public SearchResultsPage selectSmartWatch() {
		selectCategory.click();
		return PageFactory.initElements(driver, SearchResultsPage.class);
	}

}
