package org.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As5Fast {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dhamodharan\\\\eclipse-workspace\\\\SeleniumLocators\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://fast.com/");
		Thread.sleep(5000);

		List<WebElement> cols = driver.findElements(By.xpath("//div[contains(@id,'speed')]"));
		String [] linkText =new String[cols.size()];
		int i=0;
		for (WebElement a: cols)
		{	
			linkText[i]=a.getText();
			   i++;
		System.out.println(a.getText());
	}
}

}
