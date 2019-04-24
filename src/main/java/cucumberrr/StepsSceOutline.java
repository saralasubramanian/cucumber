package cucumberrr;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsSceOutline {
	static WebDriver driver;

	@Given("The userr is in add tariff plan")
	public void the_userr_is_in_add_tariff_plan() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamodharan\\eclipse-workspace\\cucumberr\\lib\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("The userr fill in valid plan details with data {string},{string},{string},{string},{string},{string},{string}")
	public void the_userr_fill_in_valid_plan_details_with_data (String monthRent,String FreeLoc,String FreeInteg,String TreeSMS,String LocCharg,String IntCharg,String SMSCharge) {
		 

		   driver.findElement(By.id("rental1")).sendKeys(monthRent);
		   driver.findElement(By.id("local_minutes")).sendKeys(FreeLoc);
		   driver.findElement(By.id("inter_minutes")).sendKeys(FreeInteg);
		   driver.findElement(By.id("sms_pack")).sendKeys(TreeSMS);
		   driver.findElement(By.id("minutes_charges")).sendKeys(LocCharg);
		   driver.findElement(By.id("inter_charges")).sendKeys(IntCharg);
		   driver.findElement(By.id("sms_charges")).sendKeys(SMSCharge);
	}

	@When("The userr clicks submit button")
	public void the_userr_clicks_submit_button() {
		   driver.findElement(By.name("submit")).click();

	}

	@Then("The userr should see the sucess message")
	public void the_userr_should_see_the_sucess_message(io.cucumber.datatable.DataTable dataTable) {
		  Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());

	}

}
