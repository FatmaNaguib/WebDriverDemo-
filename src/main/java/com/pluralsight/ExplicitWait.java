package com.pluralsight;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement SearchField = driver.findElement(By.id("APjFqb"));
		SearchField.sendKeys("pluralsight");
		SearchField.submit();
		
	
		
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
