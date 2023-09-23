package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlistSelect {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/09/blog-post.html");
		
		WebElement selectElement = driver.findElement(By.id("sorted"));
		Select selectValue = new Select(selectElement);
		selectValue.selectByVisibleText("c");
	
		driver.close();
	}

}
