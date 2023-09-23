package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class UsingRemotWebServer {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				DesiredCapabilities.chrome());
		driver.get("https://www.pluralsight.com/");
	}

}
