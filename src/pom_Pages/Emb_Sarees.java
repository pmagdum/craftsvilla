package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;
import generics.Utility;

public class Emb_Sarees 
{
	private WebDriver driver;
	
	@FindBy(xpath="//a[@id='cpp2']")
	private WebElement page2;
	
	@FindBy(xpath="//div[@data-id='5919065']")
	private WebElement product1;
	
	public Emb_Sarees(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectProduct()
	{
		Utility.waitt(10000);
		//page2.click();
		//Utility.waitt(30000);
		product1.click();
		//Utility.waitt(60000);
	}

}
