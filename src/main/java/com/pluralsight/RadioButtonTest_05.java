package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest_05 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement>  radioButtons = driver.findElements(By.name("lang"));
		radioButtons.get(1).click(); 
		
		for (WebElement radiobutton : radioButtons) {
			if(radiobutton.isSelected()) {
				System.out.println(radiobutton.getAttribute("value"));
			}
			
		}

		driver.close();
		
	}

}
