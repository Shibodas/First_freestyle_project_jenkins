package Testcases;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.HomePage;
import Utilities.log4j;

public class CartTest extends BasePage{
	
	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void Cart() throws InterruptedException {
		driver.findElement(HomePage.Cart).click();
		Thread.sleep(3000);
		log.info("cart test is successful");
	//	assertEquals(HomePage.ct, "Cart");
		
	//}

	

}
}