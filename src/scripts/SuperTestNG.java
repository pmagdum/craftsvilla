package scripts;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import generics.Excel;

public class SuperTestNG 
{
	public WebDriver driver;
		
	ExtentReports e;
	ExtentTest t;
	LocalDateTime s;
	 	
	@BeforeTest
	public void beforeTest()
	{
		
		e= new ExtentReports("/home/tyss/Desktop/Reports/testReport.html");
		e.loadConfig(new File ("/home/tyss/Desktop/craftsvilla/project_craftsvilla/extent-config.xml"));
			
	}
	
	@BeforeMethod
	public void precondition()
	{
		 //e = new ExtentReports (System.getProperty("user.dir") +"/test-output/MyExtentReport.html", true);
		
		String xlpath = "/home/tyss/Desktop/sampleData.xlsx";
		String sheetName="Sheet1";
		String browser = Excel.getCellValue(xlpath, sheetName, 0,1);
		
		
		//String url = Excel.getCellValue(xlpath, sheetName, 1, 1);
		//String time=Excel.getCellValue(xlpath, sheetName, 2, 1);
		//long l = Long.parseLong(time);
		
		if(browser.equals("gc"))
		{
			System.setProperty("webdriver.gecko.driver","/home/tyss/Downloads/geckodriver");
			System.setProperty("webdriver.chrome.driver","/home/tyss/Downloads/chromedriver");
			driver=new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
			
		}
		System.out.println("Browser is opened.");
		
		
		//driver.get("http://www.craftsvilla.com/");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
	}
	
	
	@AfterMethod
	public void endTest(ITestResult result)
	{
				if(result.getStatus() == ITestResult.FAILURE){
				t.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
				t.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
				
				
				EventFiringWebDriver e = new EventFiringWebDriver(driver);
				File scrFile = e.getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(scrFile,new File("/home/tyss/Desktop/screenshots/" + s + "fail1.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
					else
						if(result.getStatus() == ITestResult.SUCCESS)
						{
							t.log(LogStatus.PASS,"Test case is passed. "+result.getName());
						}
		
		e.endTest(t);
		
	}
	
	@AfterTest
	public void postcondition()
	{
		e.flush();
		driver.quit();
		System.out.println("Browser is closed.");
	}

}
