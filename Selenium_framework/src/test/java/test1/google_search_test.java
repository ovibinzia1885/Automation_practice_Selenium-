package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Google_Searchpage_object;

public class google_search_test {
	
	 private static WebDriver driver =null;
	public static void main(String[] args) {
		GoogleSeachTest();
		
	}
		public static  void GoogleSeachTest() {
			String projectpath=System.getProperty("user.dir");
			System.out.println(projectpath);
			System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chrome_driver\\chromedriver.exe");
			
		    driver=new ChromeDriver();
		    
		    Google_Searchpage_object object = new Google_Searchpage_object(driver);
		    driver.get("https://www.google.com");
		    object.setTextSearchBox("a b c ");
		    object.ClickSearchButton();
		    driver.close();
		
	}

}
