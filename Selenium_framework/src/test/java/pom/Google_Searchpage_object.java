package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Searchpage_object {
	WebDriver driver=null;
	
	By textbox_search=By.name("q");
	
	By button_search=By.name("btnK");
	
	public Google_Searchpage_object(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setTextSearchBox(String text) {
		driver.findElement(button_search).sendKeys(text);
	}
	
	public void ClickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.ENTER );
	}

}
