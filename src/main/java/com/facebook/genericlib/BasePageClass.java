package com.facebook.genericlib;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Khushbu Ameta
 *
 */
public class BasePageClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Enter browser-chrome/firefox??");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		if(str.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(str.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");		
		
	}
	
	@BeforeMethod
	public void openFacebookPage()
	{
		WebDriverUtility wd=new WebDriverUtility();
		wd.waitForElement(driver);
				
	}
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
