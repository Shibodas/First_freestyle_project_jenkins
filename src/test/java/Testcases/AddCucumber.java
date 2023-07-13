package Testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.HomePage;
import Utilities.log4j;
public class AddCucumber extends BasePage{
	
	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void Cucumber() {
		driver.findElement(HomePage.AddCucumber).click();
		driver.findElement(HomePage.AddCucumber).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(HomePage.CucumberCart).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		log.info("cucumber is succcesfully added to cart");
		Assert.assertEquals(HomePage.ac, "ADD TO CART");
	}
	
	}


