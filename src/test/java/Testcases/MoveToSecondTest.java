package Testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.HomePage;
import Pages.SecondTopDealPage;
import Utilities.log4j;

public class MoveToSecondTest extends BasePage{
	
	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void SecondPage() {
		driver.findElement(HomePage.topDeals).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(SecondTopDealPage.Second).click();
		log.info("Second page is working properly");
	}

}
