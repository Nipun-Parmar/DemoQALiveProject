package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultsPage {
	
	@FindBy(linkText = "Samsung SyncMaster 941BW")
	public static WebElement samsungSyncMasterSearchResult;
	
	@FindBy(css = "input[id='button-search']+h2+p")
	public static WebElement noResultMessage;
	
	@FindBy(xpath = "span[text()='Add to Cart'][1]")
	public static WebElement firstAddToCartOption;
	
	public SearchResultsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	public static void addFirstProductInTheSearchResultsToCart() {
		Elements.click(firstAddToCartOption);
	}

}
