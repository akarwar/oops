package oopsPractics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromePoly extends Base{
	public static WebDriver driver;
	
	public static void browserSetup() {
		System.setProperty("webdriver.chrome.driver","/Users/waqaskhan/Downloads/chromedriver");
		 driver = new ChromeDriver();
	}

}
