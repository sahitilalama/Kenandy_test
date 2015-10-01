package com.selenium.kenandy;

public class Configuration {

	// By Website.
	public static final String homepage = "https://www.amazon.com/gp/gw/ajax/s.html";

	// By Xpath.
	public static final String searchField = "//*[@id='twotabsearchtextbox']";
	public static final String searchButton = "//*[@id='nav-search']/form/div[2]/div/input";
	public static final String selectCategory = "//*[@id='refinements']/div[2]/ul[1]/li[1]/ul/li[1]/a/span";
	public static final String ratings = "//*[@id='acrPopover']/span[1]/a/i[1]";

	// By PartialLinkText
	public static final String appleWatch = "Apple Watch Sport";
	public static final String ratingValue = "out of 5 stars";

}
