package scripts;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.ListenerClass;
import generics.Utility;
import pom_Pages.Home_Page;

//@Listeners(ListenerClass.class)

public class Home_Page_Test extends SuperTestNG 
{
	
	@Test (priority=1)
	public void HomePage()
	{		
		t=e.startTest("HomePage");
		driver.get("http://www.craftsvilla.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Home_Page hp = new Home_Page(driver);
		
		hp.PresentElements();
		hp.displayMainMenues();
	}
	
	@Test (priority=2)
	public void failTest()
	{
		t=e.startTest("failTest");
		
		driver.get("www.aaaaa.com");
		Utility.waitt(5000);
		//Assert.fail();
	}

}
