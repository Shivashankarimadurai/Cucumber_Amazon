package com.StefDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetDefinition {
	
	static WebDriver driver;
	@Given("User Landed On The Facebook Page")
	public void user_landed_on_the_facebook_page() {
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
	}
	
	@When("User Enter Username In The Username Field {string}")
	public void user_enter_username_in_the_username_field(String username) {
	    driver.findElement(By.id("email")).sendKeys(username);
	}
	@When("User Enter The Password In {string} The Password Field")
	public void user_enter_the_password_in_the_password_field(String password) {
	    driver.findElement(By.name("pass")).sendKeys(password);
	}
	@When("User Click The LoginButton  It will navigate To The Homepage")
	public void user_click_the_login_button_it_will_navigate_to_the_homepage() {
	    driver.findElement(By.name("login")).click();
	}
	@Then("User Landed On The Facebook Homepage")
	public void user_landed_on_the_facebook_homepage() {
	    System.out.println("User Landed ON the home page");
	}
}
