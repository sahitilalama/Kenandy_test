/*package com.selenium.kenandy;

import junit.framework.TestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.kenandy.Configuration;
import com.selenium.kenandy.FinalCheckOut;

public class RatingsPage extends TestCase{

	WebDriver driver;

	public RatingsPage(WebDriver driver) {
		this.driver = driver;
	}

	public FinalCheckOut verifyPaymentInformation() {

		// Write the assert Statements.
		assertEquals("Gift Item: KI Prepaid 1 Month",
				driver.findElement(By.xpath(Configuration.oneMonth)).getText());
		
		assertEquals("Gift Item: 5000 Crowns",
				driver.findElement(By.xpath(Configuration.numberOfCrowns))
						.getText());

		assertEquals(
				"Gift Bundle: Arcane Builders Bundle  + show items",
				driver.findElement(By.xpath(Configuration.arcaneBuildersBundle))
						.getText());

		assertEquals("Gift Certificate",
				driver.findElement(By.xpath(Configuration.account)).getText());
		assertEquals("1",
				driver.findElement(By.xpath(Configuration.quantityPrepaid))
						.getText());

		assertEquals("5,000",
				driver.findElement(By.xpath(Configuration.quantityCrowns))
						.getText());

		assertEquals("1",
				driver.findElement(By.xpath(Configuration.quantityBundles))
						.getText());

		assertEquals("$9.95",
				driver.findElement(By.xpath(Configuration.pricePrepaid))
						.getText());

		assertEquals("$10.00",
				driver.findElement(By.xpath(Configuration.priceCrowns))
						.getText());

		assertEquals("$39.00",
				driver.findElement(By.xpath(Configuration.priceBundles))
						.getText());

		assertEquals("$0.00", driver.findElement(By.xpath(Configuration.tax))
				.getText());

		assertEquals("$58.95", driver
				.findElement(By.xpath(Configuration.total)).getText());

		return PageFactory.initElements(driver, FinalCheckOut.class);
	}

}
*/