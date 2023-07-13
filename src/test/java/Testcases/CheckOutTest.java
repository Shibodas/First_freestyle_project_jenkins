package Testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.CartCheckOutPage;
import Pages.HomePage;
import Utilities.log4j;

public class CheckOutTest extends BasePage {
	
	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void CheckOut() {
		driver.findElement(HomePage.AddCucumber).click();
		driver.findElement(HomePage.CucumberCart).click();
		driver.findElement(HomePage.Cart).click();
		driver.findElement(CartCheckOutPage.CheckOut).click();
		log.info("cart checkout feature is working properly");
		
		Assert.assertEquals(HomePage.co, "PROCEED TO CHECKOUT");
		
	}	
	

}
