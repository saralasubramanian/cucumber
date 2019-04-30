package org.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As4Bobcat {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dhamodharan\\\\eclipse-workspace\\\\SeleniumLocators\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bobcat.com/utility-products/utv/features");
				driver.findElement(By.xpath("//strong[text()='Accept and Close']")).click();

		//driver.findElement(By.xpath("//*[@id="1431078889132"]/div[2]/div/div/div[3]/a/strong")).click();

		//List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"productGroupingDesktopContent\"]/div[1]/div[2]/div/div/div/a[2]/h2"));
		List<WebElement> cols = driver.findElements(By.xpath("//a//h5[contains(text(),'Utility')]"));

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
