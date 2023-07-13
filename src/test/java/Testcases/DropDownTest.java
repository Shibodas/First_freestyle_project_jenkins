package Testcases;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import Base.BasePage;
import Pages.HomePage;
import Pages.PageSizeSelectPage;


public class DropDownTest extends BasePage{
	
	
	
	
	@Test
	public void Select() {
		driver.findElement(HomePage.topDeals).click();
		driver.findElement(HomePage.topDeals).click();
		driver.findElement(PageSizeSelectPage.PageSize).click();
		driver.findElement(PageSizeSelectPage.MySelect).click();
		//WebElement down = driver.findElement(By.id("page-menu"));
				//org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(down);
				//WebElement mySelectedElement = driver.findElement(By.id("page-menu"));
				//Select dropdown= new Select(mySelect);
				//dropdown.selectByValue("10").click();
				
		
	}

}
