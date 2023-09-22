package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo_Firefox_01 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.pluralsight.com/");
		

	}

}
   