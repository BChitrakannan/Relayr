package com.relayr.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//program starts
public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@id='lst-ib']")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@aria-label='Google Search']")
	WebElement submitButton;
	
	@FindBy(xpath="//img[@id='hplogo']")
	WebElement googleLogo;
	
	@FindBy(xpath="//span[@id='gsri_ok0']")
	WebElement micIcon;
	
	@FindBy(xpath="//div[@id='CToSde']")
	WebElement availableLanguages;
	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement gmailLink;
	
	@FindBy(xpath="//a[text()='Images']")
	WebElement imageLink;
	
	@FindBy(xpath="//a[@title='Google apps']")
	WebElement googleApps;
	
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signinButton;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement pagination;
	
	@FindBy(xpath="//span[text()='Search instead for']")
	WebElement spellingSuggestion;
	
	@FindBy(xpath="//p[text()='Suggestions:']")
	WebElement searchSuggestion;
	
	@FindBy(xpath="//p[text()=' - did not match any documents.  ']")
	WebElement invalidInput;
	
	@FindBy(xpath="//a[contains(text(),'Wikipedia')]")
	List<WebElement> relavantResult;
	
	@FindBy(xpath="//li[@role='presentation']")
	List<WebElement> searchSuggestions;
	
	
	public void enterSearchText(String searchText) {
		searchBox.click();
		searchBox.sendKeys(searchText);
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public void verifyUIElements()
	{
		Assert.assertTrue(searchBox.isDisplayed());
		Assert.assertTrue(submitButton.isDisplayed());
		Assert.assertTrue(submitButton.isEnabled());
		Assert.assertTrue(googleLogo.isDisplayed());
		Assert.assertTrue(micIcon.isDisplayed());
		Assert.assertTrue(availableLanguages.isDisplayed());
		Assert.assertTrue(gmailLink.isDisplayed());
		Assert.assertTrue(imageLink.isDisplayed());
		Assert.assertTrue(signinButton.isDisplayed());
		
	}
	
	public void verifyPagination()
	{
		Assert.assertTrue(pagination.isDisplayed());
		
	}
	public void verifySpelling()
	{
		Assert.assertTrue(spellingSuggestion.isDisplayed());
	}
	
	public void verifySearchSuggestion()
	{
		Assert.assertTrue(invalidInput.isDisplayed());
		Assert.assertTrue(searchSuggestion.isDisplayed(), "true");
	}
	
	public void verifyRelavantResult()
	{
		Assert.assertTrue(relavantResult.size()!=0);
			
	}
	
	public void verifySearchSuggestions()
	{
		List<WebElement> list=new ArrayList<WebElement>();
		list = searchSuggestions;
		String listname=list.get(3).getText();
		System.out.println(listname);
        list.get(3).click();
	}


}
