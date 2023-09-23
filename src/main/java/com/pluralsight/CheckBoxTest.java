package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/radio.html");
		
		WebElement checkBox = driver.findElement(By.id("vfb-6-0"));
		checkBox.click();
		checkBox.click();
		driver.close();
	}

}
 