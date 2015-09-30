package com.selenium.kenandy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AppleWatchRatingsPage {
	WebDriver driver;

	public AppleWatchRatingsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = Configuration.ratings)
	public WebElement ratings;

	public void hoverRatings() {
		Actions ac = new Actions(driver);
		ac.moveToElement(ratings).build().perform();

		String ratingsText = ratings.getText();
	}

}
