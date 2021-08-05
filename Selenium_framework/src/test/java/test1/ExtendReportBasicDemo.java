package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.bytebuddy.asm.Advice.Argument;

public class ExtendReportBasicDemo {
	private static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		// create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        
	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("Google Test one","this is test to violate google search");
	        String projectpath=System.getProperty("user.dir");
			System.out.println(projectpath);
			System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chrome_driver\\chromedriver.exe");
			
		    driver=new ChromeDriver();
		    test.log(Status.INFO, "Starting Test Case");
		    driver.get("https://www.yahoo.com");
		    test.pass("Navigate website");
		   // driver.findElement(By.name("q")).sendKeys("Nazmul Hoque ovy");
		    driver.findElement(By.className("_yb_4t0u5")).click();
	
//		    Thread.sleep(1000);
//		    test.pass("Enter value in search box");
//		    Thread.sleep(2000);
//		    driver.findElement(By.name("btnK")).click();
//		    Thread.sleep(1000);
//		    test.pass("pressedkeyboardenterkey");
		    driver.close();
		    driver.quit();
		    test.pass("close the browser");
		    test.pass("test completed");
		    // calling flush writes everything to the log file
//	        extent.flush();
//		    
	}

}
