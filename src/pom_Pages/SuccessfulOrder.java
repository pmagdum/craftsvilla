package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessfulOrder 
{
	private WebDriver driver;
	
	@FindBy(xpath="//span[@id='order-no']")
	private WebElement orderNo;
	
	@FindBy(xpath="//product name //p[@class='product-name']")
	private WebElement prodName;
	
	@FindBy(xpath="//total price(//p/span[2])[6]")
	private WebElement totalBill;
	
	@FindBy(xpath="//button[@id='js-continue-shopping']")
	private WebElement continueShopping;
	
	public SuccessfulOrder(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void getShoppingDetails()
	{
		System.out.println("Shopping details are:  ");
		System.out.println("Order number : " +orderNo);
		System.out.println("Product name : "+prodName);
		System.out.println("total bill : "+totalBill);
	}
	
	public void keepShopping()
	{
		continueShopping.click();
	}

}
