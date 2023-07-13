package Testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.HomePage;
import Utilities.log4j;

public class FlightBookingTest extends BasePage{
	
	Logger log = log4j.getLogger(log4j.class);
	@Test
	public void Flight() throws InterruptedException {
		driver.findElement(HomePage.FlightBooking).click();
		Thread.sleep(4000);
		//driver.findElement(HomePage.Hotel).click();
		log.info("Flight Booking Test is working Properly");
		
		Assert.assertEquals(HomePage.fl, "Flight Booking");
		
	}
	
		
	
	}
	


