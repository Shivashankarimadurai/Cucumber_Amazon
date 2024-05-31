package com.StefDef;

import org.openqa.selenium.By;

import com.base.BaseClass;
import com.poma.pageObjectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon_StefDef extends BaseClass{
	pageObjectManager pp =new pageObjectManager(driver);
		
	
	@Given("Launch The Url")
	public void launch_the_url() {
	    launchUrl(driver, "https://www.amazon.in/",10 );	    
	}
	@When("Click The Sigin Button To Navigate To The Loginpage")
	public void click_the_sigin_button_to_navigate_to_the_loginpage() {
	      clickButton(pp.getloginpage().pressSiginbtn());
	}
	@And("user enter the valid moblienum in the moblienum feild")
	public void user_enter_the_valid_moblienum_in_the_moblienum_feild() {
	    sendvalues(driver,  pp.getloginpage().getMobliebtn(),"6374847211" , 10);
	}
	@And("user click the continue Button to navigate password page")
	public void user_click_the_continue_button_to_navigate_password_page() {
	   clickButton(pp.getloginpage().getCotinuebtn());
	}
	@And("user should click the password Button and enter the valid password in the password feild")
	public void user_should_click_the_password_button_and_enter_the_valid_password_in_the_password_feild() {
	   sendvalues(driver, pp.getloginpage().getPasswordbtm(), "123456", 10);
	}
	@And("user landed on the Amazon home page")
	public void user_landed_on_the_amazon_home_page() {
		clickButton(pp.getloginpage().getSigbtn());
		System.out.print("user on Home Page");
	}

	
	@When("User Select the Search Bar Feild")
	public void user_select_the_search_bar_feild() {
	    clickButton(pp.getsearchpage().getSearchbar());
	    System.out.print("Scenario2 start");
	}
	@And("User Enter The Product Name In The Search Bar")
	public void user_enter_the_product_name_in_the_search_bar() {
	  sendvalues(driver, pp.getsearchpage().getSearchbar(),"dell xps",10);
	}
	@And("Click The Search Button")
	public void click_the_search_button() {
	 clickButton( pp.getsearchpage().getSearchbtn());
	}
	@And("Scrolldown The Window And Click The Product")
	public void scrolldown_the_window_and_click_the_product() {
		JSScrollBy(500);
		clickButton(pp.getsearchpage().getProductselection());
		JSScrollBy(500);
		System.out.print("over");
	}
	@Then("Scrolldown The Page And Click The Add To Cart Button")
	public void scrolldown_the_page_and_click_the_add_to_cart_button() {		
		windowhandles(driver,1);	    
		JSFindElement(pp.getsearchpage().getAddtocartbutton());
	    staticwait(2000);
	}
	
	
	@When("User Click The Proceed To Buy Button")
	public void user_click_the_proceed_to_buy_button() {
	   clickButton(pp.getpaymentpage().getProceed_btn());
	}
	@And("Select default Address Button")
	public void select_default_address_button() {
	    clickButton(pp.getpaymentpage().getDefault_Btn());
	}
	
	@And("scroll up the page")
	public void select_enter_card_details_link() {
		staticwait(10000);
		JSScrollBy(500);
	}
	@Then("verifi the checkout page and select apply")
	public void verifi_the_checkout_page_and_select_apply() {
		System.out.print("verified");
	}
	



}
