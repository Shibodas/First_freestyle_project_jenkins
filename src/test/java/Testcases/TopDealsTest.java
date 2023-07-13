package Testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.HomePage;
import Utilities.log4j;

public class TopDealsTest extends BasePage{

	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void topDealsTest() throws InterruptedException {
		driver.findElement(HomePage.topDeals).click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		log.info("i top deals test is working succesfully");
		
		
	//}
	
	//public void abc() {
		//Assert.assertEquals(driver.getTitle(), "Greenkart - veg and fruits kart");
		Assert.assertEquals(HomePage.topDealstext, "Top Deals");
	
		//String actual="//a[@class=\"cart-header-navlink\"][@href=\"#/offers\"]";
		//String expected = "HomePage.topDeals.click()";
		//Assert.assertEquals(actual, expected);
				
	
}
	}

