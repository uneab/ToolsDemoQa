package org.test.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefin extends Base {
	WebDriver driver;
	String selectedCountry;
	
	
	@Given("^user enters the facebook page$")
	public void user_enters_the_facebook_page() {
  driver=getDriver("http://demoqa.com/registration/");
	}

	@When("^user enters the credentials and email$")
	public void user_enters_the_credentials_and_email() throws Throwable {
DemoQaPom obj=new DemoQaPom();
Thread.sleep(3000);
sendData(obj.getFirstname(),"MS");
sendData(obj.getLastname(),"dhoni");
sendData(obj.getPhone(),"123546465645");
sendData(obj.getUserName(),"uneab");
sendData(obj.getEmail(),"uenab@gmail.com");
	}

	@Then("^user clicks the logi button$")
	public void user_clicks_the_logi_button() throws Throwable {
		DemoQaPom obj=new DemoQaPom();
		 Assert.assertEquals("MS", obj.getFirstname().getAttribute("value"));
		 Assert.assertEquals("dhoni", obj.getLastname().getAttribute("value"));
		 Assert.assertEquals("123546465645", obj.getPhone().getAttribute("value"));
		 Assert.assertEquals("uneab", obj.getUserName().getAttribute("value"));
		 Assert.assertEquals("LeoMessi@gmail.com", obj.getEmail().getAttribute("value"));
		 quit(driver);
	}

	@When("^The user choose MaritalStatusRadio$")
	public void the_user_choose_MaritalStatusRadio() throws Throwable {
		DemoQaPom obj=new DemoQaPom();
click(obj.getSinglestatus());
Thread.sleep(3000);
	}
	
	

	@Then("^The user verifies the selected MaritalStatusRadio$")
	public void the_user_verifies_the_selected_MaritalStatusRadio() throws Throwable {
		DemoQaPom obj=new DemoQaPom();
		Assert.assertTrue(obj.getSinglestatus().isSelected());
		 quit(driver);

	}
	

	@When("^The user select the country$")
	public void the_user_select_the_country() throws Throwable {
		DemoQaPom obj=new DemoQaPom();
Select countryselect= new Select(obj.getDropdown());

selectedCountry=countryselect.getFirstSelectedOption().getText();
	}

	@Then("^The user verifies the selected dropdown$")
	public void the_user_verifies_the_selected_dropdown() throws Throwable {
		DemoQaPom obj=new DemoQaPom();
		Assert.assertEquals("Afghanistan", selectedCountry);
		quit(driver);
	}
}
s