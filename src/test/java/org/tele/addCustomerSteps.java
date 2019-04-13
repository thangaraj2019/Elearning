package org.tele;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addCustomerSteps {
	@Given("The User in the add Customer Page")
	public void the_User_in_the_add_Customer_Page() {
	Base b = new Base();
	b.getDriver();
	b.launch("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The User fill in the customer details")
	public void the_User_fill_in_the_customer_details()  {
		
		addCustomerPage C = new addCustomerPage();
		Base b = new Base();
		b.type(C.getFirstname(),"Thangaraj");
		b.type(C.getLastname(), "D");
		b.type(C.getEmailID(), "thangaraj.mail@gmail.com");
		b.type(C.getAddress(),"chennai");
		b.type(C.getMobile(),"8939786490");
			    
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		addCustomerPage C = new addCustomerPage();
		Base b = new Base();
		b.clickmet(C.getSubmit());	    
	}

	@Then("The user should see the Customer ID")
	public void the_user_should_see_the_Customer_ID() {
		
		addCustomerPage C = new addCustomerPage();
		Base b = new Base();
		  
		Assert.assertEquals("Access Details to Guru99 Telecom",b.driver.findElement(By.xpath("//header[@class='align-center']")).getText());
	}

}
