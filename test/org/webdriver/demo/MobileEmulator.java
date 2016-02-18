package org.webdriver.demo;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileEmulator {

	final static String ChromeDriverPath = "C:\\QA\\ATF\\bin\\chromedriver.exe";
	
	public static void main(String[] args) {	
		
		String mobile = "Apple iPhone 6";
		//set chromedriver path
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
		
		Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", mobile);
 
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        WebDriver driver = new ChromeDriver(capabilities);
 
        driver.get("http://www.google.com");        
        
        try {
        	Thread.sleep(5000);
        	System.out.println(driver.getCurrentUrl());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
        	driver.quit();
        }
	}

}
