package org.test.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaPom extends Base {

	public DemoQaPom() {
		PageFactory.initElements(driver, this);
		
	}	
	
	@FindBy(name = "first_name") 
	private WebElement firstname;
	
	@FindBy(name = "last_name") 
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@value = 'single']") 
	private WebElement singlestatus;
	
	@FindBy(xpath = "//input[@value = 'cricket ']") 
	private WebElement hobbycricket;
	
	@FindBy(id = "dropdown_7")
	private WebElement dropdown;

	@FindBy(id = "mm_date_8")
	private WebElement month;

	@FindBy(id = "dd_date_8")
	private WebElement date;

	@FindBy(id = "yy_date_8")
	private WebElement year;
	
	@FindBy(id = "phone_9")
	private WebElement phone;

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "email_1")
	private WebElement email;

	@FindBy(id = "description")
	private WebElement desc;

	@FindBy(id = "password_2")
	private WebElement pw;

	@FindBy(id = "confirm_password_password_2")
	private WebElement pwConfirm;

	@FindBy(name = "pie_submit")
	private WebElement submitBtn;

	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getSinglestatus() {
		return singlestatus;
	}


	public WebElement getHobbycricket() {
		return hobbycricket;
	}


	public WebElement getDropdown() {
		return dropdown;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getDate() {
		return date;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getUserName() {
		return userName;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getDesc() {
		return desc;
	}


	public WebElement getPw() {
		return pw;
	}


	public WebElement getPwConfirm() {
		return pwConfirm;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}


}
