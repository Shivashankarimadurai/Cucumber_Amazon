package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_loginPOM {
public WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	private WebElement siginbtn;
	

	@FindBy(xpath = "//input[@name='email']")
	private WebElement mobliebtn;
	
	@FindBy(id = "continue")
	private WebElement cotinuebtn;
	
	@FindBy(name ="password")
	private WebElement passwordbtm;
	
	@FindBy( xpath ="//input[@type='submit']")
	private WebElement sigbtn;

    public Amazon_loginPOM(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement pressSiginbtn() {
		return siginbtn;
	}

	public WebElement getMobliebtn() {
		return mobliebtn;
	}

	public WebElement getCotinuebtn() {
		return cotinuebtn;
	}

	public WebElement getPasswordbtm() {
		return passwordbtm;
	}

	public WebElement getSigbtn() {
		return sigbtn;
	}
	
}
