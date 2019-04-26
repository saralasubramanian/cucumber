package cucumberrr;

import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PomExecutiom extends PomBaseclass {

	PomLocators p = new PomLocators();

	@Given("The user is in add tariff plan")
	public void plan() throws InterruptedException {

		launch("http://demo.guru99.com/telecom/addtariffplans.php");
		Thread.sleep(5000);

	}

	@When("The user fill in valid plan details with data")

	public void the_user_fill_in_valid_plan_details_with_data() {
        type(p.getmonthRent(), "67567");
		type(p.getfreeLoc(),"2356");
		type(p.getfreeInteg(), "8979");
		type(p.getsMSCharge(), "5645");
		type(p.gettreeSMS(), "345");
		type(p.getlocCharg(), "3457");
		type(p.getintCharg(), "3566");
	}

	@When("The user clicks submit button using pom")
	public void the_user_clicks_submit_button_using_pom() {
		clickBtn(p.getbtnsubmit());

	}

	@Then("The user should see the sucess message")
	public void the_user_should_see_the_sucess_message() {
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());

	}

}
