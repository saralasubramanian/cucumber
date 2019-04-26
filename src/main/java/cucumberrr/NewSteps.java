package cucumberrr;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class NewSteps {

	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	 
		   Hooks.driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable addcustomer) {
	List<String>addcustomerList=addcustomer.asList(String.class);
	
	 Hooks.driver.findElement(By.xpath("//label [@for= 'done'] ")).click();
	 //Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	  // Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();

	   Hooks.driver.findElement(By.id("fname")).sendKeys(addcustomerList.get(0));
	   Hooks.driver.findElement(By.id("lname")).sendKeys(addcustomerList.get(1));
	   Hooks.driver.findElement(By.id("email")).sendKeys(addcustomerList.get(2));
	   Hooks.driver.findElement(By.name("addr")).sendKeys(addcustomerList.get(3));
	   Hooks.driver.findElement(By.id("telephoneno")).sendKeys(addcustomerList.get(4));

	}

	@When("The user clicks submit button")
	public void the_user_clicks_submit_button() {
		   Hooks.driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		
			  Assert.assertTrue(Hooks.driver.findElement(By.tagName("h3")).isDisplayed());
	}


}
