package com.pluralsight;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementBylinktext {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchField = driver.findElement(By.id("APjFqb"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement imagesLink = driver. findElements(By.linkText("صور")).get(0);
		imagesLink.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement imageElement = driver.findElements(By.cssSelector(".nfEiy")).get(0);
		 WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		 imageLink.click();
		 
		 
		driver.close();
	}

}
