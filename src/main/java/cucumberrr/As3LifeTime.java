package org.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As3LifeTime {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dhamodharan\\\\eclipse-workspace\\\\SeleniumLocators\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//img[@alt='Close']")).click();

	driver.findElement(By.xpath("//a[@class=' nav-link    dropdown-toggle'][1]")).click();

		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"primaryNav\"]/li[1]/div[2]/ul/li"));
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


