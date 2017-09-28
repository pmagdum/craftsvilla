package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static void actions(WebDriver driver, WebElement element1, WebElement element2) {
		//System.out.println("actons 1 ");
		
		
		System.out.println("fsdfsdfsdf");

		Actions act = new Actions(driver);

		//System.out.println(act);
		
		act.moveToElement(element1).build();
		
		element2.click();
		System.out.println("ppppppppp");
	}

	public static void waitt(long milisec) {
		try {
			Thread.sleep(milisec);
		} catch (Exception e) {
		}
	}

	public static void selectFromList(WebElement e, String text) {
		Select select = new Select(e);
		select.selectByVisibleText(text);

	}
}
