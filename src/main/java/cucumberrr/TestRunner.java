package cucumberrr;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\cucumbe\\Addcustomer.feature",tags= {"@us1"},glue="cucumberr",plugin="html:target",monochrome=true)
public class TestRunner {


}
