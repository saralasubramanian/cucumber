package cucumberrr;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PomBaseclass {
		static WebDriver driver;

		public static WebDriver launch(String url) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dhamodharan\\eclipse-workspace\\SeleniumLocators\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			return driver;
		}

		public static void type(WebElement e, String n) {
			e.sendKeys(n);
		}

		public static void clickBtn(WebElement e) {
			e.click();

		}

			public static void closeBrowser(WebDriver driver) {
			driver.quit();
		}

		
	}

