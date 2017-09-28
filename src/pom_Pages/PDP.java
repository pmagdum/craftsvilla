package pom_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Utility;

public class PDP {
	private WebDriver driver;

	@FindBy(xpath = "//button[@id='addtocart']")
	private WebElement addTocart;

	@FindBy(xpath = "//button[@id='submitpincode']")
	private WebElement checkAvailability;

	@FindBy(xpath = "//input[@id='pincode_value']")
	private WebElement enterPincode;

	@FindBy(xpath = "//button[@id='buynow']")
	private WebElement buyNow;

	@FindBy(xpath = "//li[@class='active']/span")
	private WebElement breadcrumb_prodNm;

	public void getProdNm() {
		String prodNm = breadcrumb_prodNm.getText();
		System.out.println("Product name : " + prodNm);
	}
	
	public PDP(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void addTocart() {
		addTocart.click();
		Utility.waitt(90000);
	}

	public void buyNw() {
		buyNow.click();
	}

	public void checkAvailability(String pincode) 
	{
		enterPincode.sendKeys(pincode);
		checkAvailability.click();

		String jscode = "document.getElementById('pincode_value').value";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Object dsd = js.executeScript(jscode);
/*
		 String s = (String) js.executeScript(jscode);
		if (s.contains("Available at")) {
			System.out.println("Product Available for entered pincode");
			addTocart();
		} else {
			System.out.println("Product NOT Available for entered pincode");
			enterPincode.sendKeys(pincode);
		}*/
	}

}
