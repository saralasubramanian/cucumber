package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ag10Lifetime {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dhamodharan\\\\eclipse-workspace\\\\SeleniumLocators\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//img[@alt='Close']")).click();

	driver.findElement(By.xpath("//*[@id=\"primaryNav\"]/li[3]/a")).click();
	driver.findElement(By.xpath("//div//ul//li[7]")).click();


	}
}
