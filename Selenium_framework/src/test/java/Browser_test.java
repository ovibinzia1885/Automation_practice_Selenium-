import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_test {
	public static void main(String[] args) {
		
		
		String projectpath=System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationstepbystep.com");
	}

}
