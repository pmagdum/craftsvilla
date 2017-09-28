package pom_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Utility;

public class Home_Page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='searchval']")
	private WebElement searchbox;

	@FindBy(xpath = "//span[text()='Cart ']")
	private WebElement cart;

	@FindBy(xpath = "//span[text()='Sign In']")
	private WebElement login;

	@FindBy(xpath = "//nav[@id='mega-menu']/div/ul/li/a")
	private List<WebElement> MainMenues;

	@FindBy(xpath = "(//nav[@id='mega-menu']/div/ul/li/a)[3]")
	private WebElement Saree;

	//@FindBy(xpath = "(//nav[@id='mega-menu']/div/ul/li)[4]/div/div/ul/li[2]/ul/li[2]/a")
	
	@FindBy(xpath = "//a[text()='Embroidery']")
	private WebElement Saree_Embroidery;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void PresentElements() {
		if (searchbox.isDisplayed()) {
			System.out.println("Search box is present.");
		} else {
			System.out.println("Search box is not present.");
		}

		if (cart.isDisplayed()) {
			System.out.println("Cart is present.");
		} else {
			System.out.println("Cart is not present.");
		}

		if (login.isDisplayed()) {
			System.out.println("Login is present.");
		} else {
			System.out.println("Login is not present.");
		}
		System.out.println("------------------------------");
	}

	public void displayMainMenues() {
		System.out.println("Main manues are : ");
		int c = MainMenues.size();

		for (WebElement e : MainMenues) {
			String menu = e.getText();
			System.out.println(menu);
		}
	}

	public void select_subMenu_option()  {
		
		Saree.click();

		// Utility.actions(driver, Saree, Saree_Embroidery);

		
	}

}
