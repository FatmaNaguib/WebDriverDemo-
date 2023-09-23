package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemoChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pluralsight.com/");
	}

}
