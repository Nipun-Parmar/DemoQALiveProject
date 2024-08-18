package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ForgotPasswordPage {
	
	@FindBy(id = "input-email")
	public static WebElement emailField;
	
	@FindBy(css = "input[type='submit'][value='Continue']")
	public static WebElement continueButton;
	
	public ForgotPasswordPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

}
