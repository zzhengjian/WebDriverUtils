package org.webdriver.demo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ElementScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		String output = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.BASE64);
		
		
		
		System.out.println(output);
		driver.quit();

	}
}
