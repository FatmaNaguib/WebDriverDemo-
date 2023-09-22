package com.pluralsight;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables_08 {

	public static void main(String[] args) {
	
	//	WebDriver  driver = new ChromeDriver()	;
		  WebDriver driver = new FirefoxDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=table");
		
		WebElement table = driver.findElement(By.id("customers"));
		WebElement tableRaw = table.findElements(By.tagName("td")).get(1);
		//WebElement statusCheck = table.findElements(By.tagName("input")).get(2);
		
		//statusCheck.click();
		//statusCheck.submit(); 
		
		System.out.println(tableRaw.getText());
		
		driver.close();
		
		
	}

}
