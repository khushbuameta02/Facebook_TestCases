package com.facebook.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Khushbu Ameta
 *
 */
public class WebDriverUtility {
	
	/**
	 * wait for element load
	 * @param driver
	 */
	public void waitForElement(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

}
