package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ShoppingCartPage {
	
	@FindBy(linkText = "Checkout")
	public static WebElement checkoutButton;
	
	public ShoppingCartPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void navigateToCheckoutPage() {
		Elements.click(checkoutButton);
	}

}
