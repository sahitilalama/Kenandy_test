package com.selenium.kenandy;

public class Configuration {

	// By Website.
	public static final String homepage = "https://www.amazon.com/gp/gw/ajax/s.html";

	// By Xpath.
	public static final String searchField = "//*[@id='twotabsearchtextbox']";
	public static final String searchButton = "//*[@id='nav-search']/form/div[2]/div/input";
	public static final String selectCategory = "//*[@id='refinements']/div[2]/ul[1]/li[1]/ul/li[1]/a/span";
	public static final String ratings = "//*[@id='acrPopover']/span[1]/a/i[1]";
	
	// By PaartialLinkText
	public static final String appleWatchSelect = "http://www.amazon.com/Apple-Watch-Silver-Aluminum-White/dp/B00WNAX246/ref=sr_1_1?s=wearable-tech&ie=UTF8&qid=1443655645&sr=1-1&keywords=apple+watch";
}
