package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Utility;

public class CheckoutPage1 {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='address-email']")
	private WebElement enter_email;
	
	@FindBy(xpath="//input[@id='address-first-name']")
	private WebElement Fnm;
	
	
	@FindBy(xpath="//input[@id='address-last-name']")
	private WebElement Lnm;
	
	@FindBy(xpath="//ul[@class='dropdown-menu-country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='address-pincode']")
	private WebElement	pincode;
	
	@FindBy(xpath="//textarea[@id='address-textbox']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='address-mobileno']")
	private WebElement mobileNo;
	
	@FindBy(xpath="//button[@id='address-form-submit']")	
	private WebElement	submit1;
	
	@FindBy(xpath="//div[@data-payment-type='cod']") 
	private WebElement CashOnDel;
			
	@FindBy(xpath="//button[@class='pure-button payment-submit-button js-payment-submit-btn']")
	private WebElement placeOrder;
	
	public CheckoutPage1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterShoppingDetails(String email,String fnm, String lnm,String ctry,String pcode,String adrs,String mobileno)
	{
		enter_email.sendKeys(email);
		Fnm.sendKeys(fnm);
		Lnm.sendKeys(lnm);
		//Utility.selectFromList(country,ctry);
		pincode.sendKeys(pcode);
		address.sendKeys(adrs);
		mobileNo.sendKeys(mobileno);
		
		String tagname = submit1.getTagName();
		System.out.println(tagname);
		submit1.click();
		System.out.println("Clicked on DELIVER HERE button..");
		Utility.waitt(4000);
		System.out.println("Waited for 4 sec");
		//CashOnDel.click();
		//System.out.println("Clicked on COD");
		Utility.waitt(9000);
		System.out.println("Waited for 4 sec");
		placeOrder.click();
		System.out.println("clicked on Place Order.");
	}
		
	

}
