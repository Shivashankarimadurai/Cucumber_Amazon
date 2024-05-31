package com.poma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pom.Amazon_loginPOM;
import com.pom.Amazon_payment;
import com.pom.Amazon_searchpom;

public class pageObjectManager extends BaseClass{
	public WebDriver driver;
	
	Amazon_loginPOM lp;
	Amazon_searchpom as;
	Amazon_payment ap;
		
	public pageObjectManager(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver3, this);
		
	}

	public Amazon_loginPOM getloginpage() {
		if (lp==null) {
			lp =new Amazon_loginPOM(driver);
		}
		return lp;		
	}
	
	public Amazon_searchpom getsearchpage() {		
		if (as==null) {
			as =new Amazon_searchpom(driver);
		}
		return as;		
	}
	
	public Amazon_payment getpaymentpage() {
		
		if (ap==null) {
			ap = new Amazon_payment(driver);
		}
		return ap;
		
		
	}
	
	


}
