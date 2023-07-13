package Pages;

import org.openqa.selenium.By;

public class PlaceOrderPage {
	public static By PlaceOrder = By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	public static By Checkbox = By.xpath("//input[@type=\"checkbox\"]");
	public static By Proceed = By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	public static By promo = By.xpath("//input[@type=\"text\"]");
	public static By apply = By.xpath("//button[@class=\"promoBtn\"]");
	
	public static String po = "Place Order";
}
