package org.webdriver.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class UseDefaultProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile profile = new ProfilesIni().getProfile("default");
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("http://www.google.com");
		
		driver.quit();
		
		

	}

}
