package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class OrderSuccessPage {
	
	@FindBy(linkText = "Success")
	public static WebElement successBreadcrumb;
	
	public OrderSuccessPage() {
		PageFactory.initElements(Base.driver, this);
	}

}
