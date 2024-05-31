package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_searchpom {
	public WebDriver driver;
	
	@FindBy(xpath ="//input[@type='text']")
	private WebElement searchbar;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	private WebElement searchbtn;
	
	@FindBy(xpath ="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")
	private WebElement productselection;

	@FindBy(xpath ="//*[@id=\"nav-cart-count-container\"]/span[2]")
	private WebElement addtocartbutton;
	
	public Amazon_searchpom(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver3, this);
	}
	
	public WebElement getSearchbar() {
		return searchbar;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}


	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	public WebElement getProductselection() {
		return productselection;
	}
}
