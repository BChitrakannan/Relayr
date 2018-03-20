package com.relayr.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import com.relayr.test.SearchPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Search {
	WebDriver driver;
	String baseURL="https://www.google.com";
	SearchPage searchPage;
	
  @BeforeMethod
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","./Server/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(baseURL);
	  driver.manage().window().maximize();
	  searchPage = new SearchPage(driver);

	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
  }
  
  @Test
  public void validateSearh() throws Exception
  {
	  
	  		searchPage.verifyUIElements();
			searchPage.enterSearchText("Wikipedia");
			searchPage.clickSubmitButton();
			searchPage.verifyPagination();
			searchPage.verifyRelavantResult();
  }
  
  @Test
  public void validateSpellingSuggestion() throws Exception
  {
	  
	  		searchPage.verifyUIElements();
			searchPage.enterSearchText("Wikiedia");
			searchPage.clickSubmitButton();
			searchPage.verifyPagination();
			
  }
  
  @Test
  public void validateInvalidSearchText() throws Exception
  {
	  
	  		searchPage.verifyUIElements();
			searchPage.enterSearchText("sdkljsdfhfkjsfjfdsk");
			searchPage.clickSubmitButton();
			
			searchPage.verifySearchSuggestion();
			
  }
  
  @Test
  public void validateAutoSuggestions() throws Exception
  {
	  searchPage.verifyUIElements();
	  searchPage.enterSearchText("shir");
	  searchPage.verifySearchSuggestions();
  }


  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
