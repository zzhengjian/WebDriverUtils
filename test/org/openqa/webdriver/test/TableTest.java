package org.openqa.webdriver.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.webdriver.Table;



public class TableTest {
	
	
	public void Test1()
	{
		WebDriver dr = new FirefoxDriver();
		dr.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		try {
			dr.get("http://www.w3schools.com/xsl/xsl_functions.asp");
		} catch (Exception e) {
			//ignore page load time out
			//e.printStackTrace();
		}	
		System.out.println(dr.getCurrentUrl());
		WebDriverWait wait = new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(.,'Accessor Functions')]")));
		System.out.println("page loaded");
		WebElement eTable = dr.findElement(By.xpath("//h3[contains(.,'Accessor Functions')]/following-sibling::table[1]"));
		
		Table tTable = new Table(eTable);

		System.out.println(tTable.getCellText(1, 1));//row 1, column 1
		System.out.println(tTable.getCellText("fn,nilled", 1));//row 2, column 1
		System.out.println(tTable.getCellText(1, "Name"));//row 1, column 1
		System.out.println(tTable.getCellText("fn,nilled", "Description"));//row 2, column 2
		
		dr.quit();		
	}

}
