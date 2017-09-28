package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Utility;

public class CartPage 
{
	private WebDriver driver ;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement placeOrderBtn;
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void placeOrder()
	{
		placeOrderBtn.click();
		Utility.waitt(30000);
	}
}
