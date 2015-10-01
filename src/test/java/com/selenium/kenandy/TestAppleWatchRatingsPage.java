package com.selenium.kenandy;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.kenandy.AppleWatchRatingsPage;
import com.selenium.kenandy.Configuration;
import com.selenium.kenandy.SearchPage;
import com.selenium.kenandy.SearchResultsPage;
import com.selenium.kenandy.SelectCategoryPage;

public class TestAppleWatchRatingsPage {

	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("*************Starting Automation*************");
		System.out.println();
		driver.get(Configuration.homepage);
		driver.manage().window().maximize();
	}

	// Implement PageObjectModel.
	SearchPage sp = PageFactory.initElements(driver, SearchPage.class);
	SelectCategoryPage scp = PageFactory.initElements(driver,
			SelectCategoryPage.class);
	SearchResultsPage srp = PageFactory.initElements(driver,
			SearchResultsPage.class);
	AppleWatchRatingsPage awrp = PageFactory.initElements(driver,
			AppleWatchRatingsPage.class);

	@Test
	public void testAppleWatchRatings() {
		sp = sp.enterSearchField();
		scp = sp.clickSearchButton();
		srp = scp.selectSmartWatch();
		srp.findAppleWatch();
		awrp.hoverRatings("3.8");
	}

	@After
	public void after() {
		driver.close();
		driver.quit();
	}
}
