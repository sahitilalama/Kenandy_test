package com.selenium.kenandy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

	WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(partialLinkText = Configuration.appleWatch)
	public WebElement appleWatch;

	public AppleWatchRatingsPage findAppleWatch() {
		appleWatch.click();
		return PageFactory.initElements(driver, AppleWatchRatingsPage.class);
	}

}
