package cucumberrr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	static WebDriver driver;

@Before
public static void testbefore()
{System.out.println("Before");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamodharan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver= new ChromeDriver();
}
@After
public static void testafter()
{System.out.println("after");
driver.quit();
}
}
