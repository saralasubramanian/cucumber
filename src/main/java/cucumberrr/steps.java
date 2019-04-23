package cucumberrr;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	static WebDriver driver;
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamodharan\\eclipse-workspace\\cucumberr\\lib\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details() {
		  // driver.findElement(By.xpath("//label[text()='Done']")).click();
		  // driver.findElement(By.xpath("//label [@for= 'done'] ")).click();
		 driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		   driver.findElement(By.id("fname")).sendKeys("sarala");
		   driver.findElement(By.id("lname")).sendKeys("subramanian");
		   driver.findElement(By.id("email")).sendKeys("sarala@gmail.com");
		   driver.findElement(By.name("addr")).sendKeys("chennai");
		   driver.findElement(By.id("telephoneno")).sendKeys("8893633683");

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
