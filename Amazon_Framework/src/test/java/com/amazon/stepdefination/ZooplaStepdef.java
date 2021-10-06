package com.amazon.stepdefination;

import com.amazon.basepage.Basepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZooplaStepdef extends Basepage{
	@Given("^User can open any browser$")
	public void user_can_open_any_browser() {
	 setup();
	    
	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String arg1) {
	 
	    
	}

	@When("^User able to click on the login button$")
	public void user_able_to_click_on_the_login_button() {
	 
	    
	}

	@When("^User enter the userName \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_the_userName_and_password(String arg1, String arg2) {
	 
	    
	}

	@When("^User click on the signing button$")
	public void user_click_on_the_signing_button() {
	 
	    
	}

	@Then("^User able to verify successfully login & verify the homepage title$")
	public void user_able_to_verify_successfully_login_verify_the_homepage_title() {
	 
	    
	}
}
