package com.pluralsight;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchField = driver.findElement(By.id("APjFqb"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("صور")));
		
		WebElement imagesLink = driver. findElements(By.linkText("صور")).get(0);
		imagesLink.click();
		
	

		
		WebElement imageElement = driver.findElements(By.cssSelector(".nfEiy")).get(0);
		 WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		 imageLink.click();
		 
		 
		driver.close();
		

	}

}
