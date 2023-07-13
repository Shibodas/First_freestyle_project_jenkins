package Pages;

import org.openqa.selenium.By;

public class HomePage {

	public static By topDeals = By.xpath("//a[@class=\"cart-header-navlink\"][@href=\"#/offers\"]");
	public static By Search = By.xpath("//input[@type=\"search\"]");
	public static By Click = By.xpath("//button[@class=\"search-button\"]");
	public static By FlightBooking = By.xpath("//a[@class=\"cart-header-navlink\"][@href=\"https://rahulshettyacademy.com/dropdownsPractise/\"]");
//	public static By Hotel = By.xpath("//span[@style=\"position: relative; top: 3px;\"]");
	public static By Cart = By.xpath("//img[@class=\" \"]");
	public static By AddCucumber = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/a[2]");
	public static By CucumberCart = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button");
	
	//public static By topDealsText = By.xpath("//a[contains(text(),'Top Deals')");
	public static String topDealstext = "Top Deals";
	public static String As = "search-button";
	public static String fl = "Flight Booking" ;
	public static String  co = "PROCEED TO CHECKOUT";
	//public static String ct = "Cart";
	public static String ac = "ADD TO CART" ;
	
	public static By search = By.xpath("/html/body/div[3]/form/div/input");
	
}
