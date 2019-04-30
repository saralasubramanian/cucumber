package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ag9FlipElectronics {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dhamodharan\\\\eclipse-workspace\\\\SeleniumLocators\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("electronics", Keys.ENTER);
		driver.findElement(By.xpath("//li[1]//span[@class='_1QZ6fC _3Lgyp8']")).click();
		Actions a = new Actions(driver);
		WebElement b=driver.findElement(By.xpath("//li[1]//span[@class='_1QZ6fC _3Lgyp8']"));
		//driver.findElement(By.xpath("//li//a[@title='Mobiles']")).click();
		a.moveToElement(b).perform();

	WebElement c=	driver.findElement(By.xpath("//li//ul//li[2]//a[text()='Mi']"));
	a.moveToElement(c).perform();

c.click();
	
}
}
