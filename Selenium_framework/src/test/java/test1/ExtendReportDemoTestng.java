package test1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportDemoTestng {
	ExtentHtmlReporter htmlReporter;
	  ExtentReports extent;
	  WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
   
		
	}
	
	
	@BeforeTest
	public void Demo() {
		String projectpath=System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chrome_driver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
	}
	
	
	@Test
	public void test1() throws IOException {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://www.google.com");
	    test.pass("Navigate website"); 
		 test.log(Status.INFO, "This step shows usage of log(status, details)");
	        test.info("This step shows usage of info(details)");
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        test.addScreenCaptureFromPath("screenshot.png");	
	}
	
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		
		
	}

	
	@AfterSuite
	public void tearDown() {
		  extent.flush();
		
		
	}
}
