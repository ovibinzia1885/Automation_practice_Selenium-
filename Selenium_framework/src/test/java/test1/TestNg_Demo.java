package test1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.googlesearchpage;

public class TestNg_Demo {
	WebDriver driver=null;
	
	@BeforeTest
	public void Demo() {
		String projectpath=System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chrome_driver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
	}
	
	
	@Test
	public  void GoogleSearch() throws InterruptedException {
		
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		googlesearchpage.textbox_search(driver).sendKeys("Automation step by step");
//		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		googlesearchpage.button_search(driver).sendKeys(Keys.ENTER);
		
		
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println(" sucessfull search ");
		
	}

}
