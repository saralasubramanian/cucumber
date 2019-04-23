package cucumberrr;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class NewSteps {
	static WebDriver driver;

	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamodharan\\eclipse-workspace\\cucumberr\\lib\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable addcustomer) {
	List<String>addcustomerList=addcustomer.asList(String.class);
	
	 driver.findElement(By.xpath("//label [@for= 'done'] ")).click();
	 //driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	  // driver.findElement(By.xpath("//label[text()='Done']")).click();

	   driver.findElement(By.id("fname")).sendKeys(addcustomerList.get(0));
	   driver.findElement(By.id("lname")).sendKeys(addcustomerList.get(1));
	   driver.findElement(By.id("email")).sendKeys(addcustomerList.get(2));
	   driver.findElement(By.name("addr")).sendKeys(addcustomerList.get(3));
	   driver.findElement(By.id("telephoneno")).sendKeys(addcustomerList.get(4));

	}

	@When("The user clicks submit button")
	public void the_user_clicks_submit_button() {
		   driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		
			  Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}


}
