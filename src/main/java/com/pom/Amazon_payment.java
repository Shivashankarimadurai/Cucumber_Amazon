package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_payment {
	public WebDriver driver;
	
	
	@FindBy(xpath ="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	private WebElement proceed_btn;

	@FindBy(xpath ="//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")
	private WebElement default_Btn;
	
	
	
	public Amazon_payment(WebDriver driver2) {
		this .driver =driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getProceed_btn() {
		return proceed_btn;
	}

	public WebElement getDefault_Btn() {
		return default_Btn;
	}

}
