package org.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ag11Trains {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamodharan\\eclipse-workspace\\SeleniumLocators\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.trainspnrstatus.com/trains/mumbai-cst-delhi");
		List<WebElement> row = driver.findElements(By.tagName("tr"));
for (int i=0;i<row.size();i++) {
	List<WebElement> cell = row.get(i).findElements(By.tagName("td"));
for (int j=0;j<cell.size();j++) {
String text = cell.get(j).getText();
if(text.contains("05:35")) {
	String txt = row.get(i).getText();

	System.out.println(txt);
}
}	
}	}
}
