package Testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.CartCheckOutPage;
import Pages.HomePage;
import Pages.PlaceOrderPage;
import Utilities.log4j;

public class PlaceOrderTest extends BasePage{
	

	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void order() throws InterruptedException {
		driver.findElement(HomePage.AddCucumber).click();
		driver.findElement(HomePage.Cart).click();
		driver.findElement(CartCheckOutPage.CheckOut).click();
		
		Thread.sleep(3000);
		driver.findElement(PlaceOrderPage.promo).sendKeys("Nagarro");
		driver.findElement(PlaceOrderPage.apply).click();
		Thread.sleep(5000);
		driver.findElement(PlaceOrderPage.PlaceOrder).click();
		
		Thread.sleep(3000);
		driver.findElement(PlaceOrderPage.Checkbox).click();
		driver.findElement(PlaceOrderPage.Proceed).click();
		Thread.sleep(3000);
		
		
		log.info("Order Placed Succesfully");
		
	}
	

}
