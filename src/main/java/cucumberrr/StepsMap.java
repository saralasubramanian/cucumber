package cucumberrr;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepsMap {
	
static WebDriver driver;
	@Given("The user is in add customer page now")
	public void the_user_is_in_add_customer_page_now() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamodharan\\eclipse-workspace\\cucumberr\\lib\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill in valid customer details with data")
	public void the_user_fill_in_valid_customer_details_with_data(DataTable dataMap) {
		Map<String,String>custDetailsMap=dataMap.asMap(String.class,String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();

		   driver.findElement(By.id("fname")).sendKeys(custDetailsMap.get("fname"));
		   driver.findElement(By.id("lname")).sendKeys(custDetailsMap.get("lname"));
		   driver.findElement(By.id("email")).sendKeys(custDetailsMap.get("email"));
		   driver.findElement(By.name("addr")).sendKeys(custDetailsMap.get("address"));
		   driver.findElement(By.name("telephoneno")).sendKeys(custDetailsMap.get("phNum"));
	}

	@When("The user clicks submit button in the page")
	public void the_user_clicks_submit_button_in_the_page() {
		   driver.findElement(By.name("submit")).click();

	}

	@Then("The user should see the customer id generated at the end")
	public void the_user_should_see_the_customer_id_generated_at_the_end() {
		  Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());

	}


}
