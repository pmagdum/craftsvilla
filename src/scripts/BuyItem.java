package scripts;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import pom_Pages.CartPage;
import pom_Pages.CheckoutPage1;
import pom_Pages.Emb_Sarees;
import pom_Pages.Home_Page;
import pom_Pages.PDP;
import pom_Pages.SuccessfulOrder;

public class BuyItem extends SuperTestNG 
{
	
	@Test(priority=1)
	public void buy_Item() //throws InterruptedException
	{
		t=e.startTest("buy_Item");

		driver.get("http://www.craftsvilla.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		System.out.println("Entered the buytest");
		
		
		Home_Page hp = new Home_Page(driver);			
		hp.select_subMenu_option();
		
		Emb_Sarees es = new Emb_Sarees(driver);
		es.selectProduct();
		
		/*
		PDP pdp = new PDP(driver);
		pdp.checkAvailability("560040");
		pdp.addTocart();
		
		
		CartPage c = new CartPage(driver);
		c.placeOrder();
		
		CheckoutPage1 cp1 = new CheckoutPage1(driver);
		cp1.enterShoppingDetails("abcd@gmail.com", "Meenu","S.", "India","416112", "Rajarampuri, Near bus stand","9970887766");
		
		
		SuccessfulOrder so = new SuccessfulOrder(driver);
		so.getShoppingDetails();
		so.keepShopping();
		*/
	}

}
