package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.googlesearchpage;

public class googlesearchtest {
	 private static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		GoogleSearch();
		
	}
	
	public static void GoogleSearch() throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chrome_driver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		googlesearchpage.textbox_search(driver).sendKeys("Automation step by step");
//		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		googlesearchpage.button_search(driver).sendKeys(Keys.ENTER);
		
		driver.close();
		System.out.println(" sucessfull search ");
	}

}
