package org.tele;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage {
	
	public addCustomerPage () {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy (id = "fname")
	private WebElement Firstname;
	
	@FindBy (id = "lname")
	private WebElement Lastname;
	
	
	@FindBy (id = "email")
	private WebElement EmailID;
	
	@FindBy (name = "addr")
	private WebElement Address;
	
	@FindBy (id = "telephoneno")
	private WebElement Mobile;
	
	@FindBy (xpath = "//input[@value = 'Submit']")
	private WebElement Submit;

	public WebElement getFirstname() {
		return Firstname;
	}


	public WebElement getLastname() {
		return Lastname;
	}


	public WebElement getEmailID() {
		return EmailID;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getMobile() {
		return Mobile;
	}


	public WebElement getSubmit() {
		return Submit;
	}
	
	}
