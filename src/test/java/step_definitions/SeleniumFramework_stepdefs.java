package step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.kenandy.AppleWatchRatingsPage;
import com.selenium.kenandy.Configuration;
import com.selenium.kenandy.SearchPage;
import com.selenium.kenandy.SearchResultsPage;
import com.selenium.kenandy.SelectCategoryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumFramework_stepdefs {

	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// Implement PageObjectModel.
	SearchPage sp = PageFactory.initElements(driver, SearchPage.class);
	SelectCategoryPage scp = PageFactory.initElements(driver,
			SelectCategoryPage.class);
	SearchResultsPage srp = PageFactory.initElements(driver,
			SearchResultsPage.class);
	AppleWatchRatingsPage rp = PageFactory.initElements(driver, AppleWatchRatingsPage.class);

	@Given("^I open Amazon website$")
	public void i_open_Amazon_website() throws Throwable {
		driver.get(Configuration.homepage);
		driver.manage().window().maximize();
	}

	@When("^I enter apple watch in search field$")
	public void i_enter_apple_watch_in_search_field() throws Throwable {
		sp = sp.enterSearchField();
	}

	@Then("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {
		scp = sp.clickSearchButton();
	}

	@Then("^I select Smart Watches under Electronics Category$")
	public void i_select_Smart_Watches_under_Electronics_Category()
			throws Throwable {
		srp = scp.getSearchResults();
	}

	@Then("^I click on the link Apple Watch (\\d+)mm$")
	public void i_click_on_the_link_Apple_Watch_mm(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		srp.getSearchResults();
	}


	@Then("^I hover mouse over the Ratings$")
	public void i_hover_mouse_over_the_Ratings() throws Throwable {
		rp.hoverRatings();
	}

	@Then("^I get the ratings$")
	public void i_get_the_ratings() throws Throwable {

	}

	@Then("^I assert the rating as (\\d+)\\.(\\d+)$")
	public void i_assert_the_rating_as(int arg1, int arg2) throws Throwable {

	}

	@Then("^I close and quit the browser$")
	public void i_close_and_quit_the_browser() throws Throwable {

	}

}
