package Testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.HomePage;
import Utilities.log4j;

public class SearchTest extends BasePage {
	
	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void SearchTest() throws InterruptedException {
		driver.findElement(HomePage.Search).sendKeys("apple");
		Thread.sleep(3000);
		driver.findElement(HomePage.Click).click();
		log.info("search test is working properly");
		Assert.assertEquals(HomePage.As, "search-button");
		
	}
	
}
