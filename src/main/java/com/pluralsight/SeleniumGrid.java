package com.pluralsight;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				DesiredCapabilities.chrome());
		driver.get("https://www.pluralsight.com/");
		
	}

}
