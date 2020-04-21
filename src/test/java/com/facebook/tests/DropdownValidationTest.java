package com.facebook.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.genericlib.BasePageClass;
import com.facebook.genericlib.WebDriverUtility;
/**
 * 
 * @author Khushbu Ameta
 *
 */
public class DropdownValidationTest extends BasePageClass {
	
	@Test(enabled=true)
	public void validateDropdownOptionDuplication()
	{
		//find dropdown location
				WebElement ddAddr = driver.findElement(By.id("month"));
				Select sel=new Select(ddAddr);
				
		//get all options of dropdown
				List<WebElement> allOptions= sel.getOptions();
				
		//Create List to store all Options
		List listoptions=new ArrayList();
		
		for(WebElement optionEle:allOptions)
		{
			listoptions.add(optionEle.getText());
		}
		listoptions.remove("Month");
		System.out.println(listoptions);
		int actualsize = listoptions.size();
		
		
		Set<String>  var_set;
	    var_set = (Set<String>) listoptions.stream().collect(Collectors.toSet());	
		System.out.println(var_set);
		int expted_size = var_set.size();
		
		Assert.assertEquals(actualsize, expted_size);
		System.out.println("No duplicate value");
	}
	
}
