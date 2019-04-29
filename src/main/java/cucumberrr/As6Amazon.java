package org.first;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As6Amazon {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dhamodharan\\\\eclipse-workspace\\\\SeleniumLocators\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone8", Keys.ENTER);
		
		 
		gotonext();
		Thread.sleep(5000);
		//Actions action= new Actions(driver);
		//action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		//driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		}

	private static void gotonext() {
		double pageNu = (Math.random()*((16-1)+1))+1;
		int pageN = (int) pageNu;
		System.out.println(pageN);
		
		String pageNum = String.valueOf(pageN); 

		String loc = "//img[@data-image-index='$']";
		loc = loc.replace("$", pageNum);
		driver.findElement(By.xpath(loc)).click();}
		/*ArrayList tabs = new ArrayList (driver.getWindowHandles());
	    System.out.println(tabs.size());
        driver.switchTo().window("tabs,get(2)");*/
	
}