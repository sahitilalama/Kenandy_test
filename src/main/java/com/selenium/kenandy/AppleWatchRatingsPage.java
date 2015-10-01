package com.selenium.kenandy;

import java.util.NoSuchElementException;

import org.junit.Assert;
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
	
	@FindBy(partialLinkText = Configuration.ratingValue)
	public WebElement ratingValue;
	

	public void hoverRatings(String input) {
		String output = null;
		Actions ac = new Actions(driver);
		ac.moveToElement(ratings).build().perform();
		
		try{
			output = ratingValue.getText();
		}catch(NoSuchElementException ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Rating for the Apple Watch is "+ output);
		Assert.assertTrue("Rating Not Equal to 3.8",output.contains(input));
		System.out.println();
		System.out.println("*************Completed Automation and Succeded*************");
	}

}
