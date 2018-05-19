package oopsPractics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Example of Inheritance
public class Base {
	public static WebDriver driver;
	
	public static void browserSetup() {
		System.setProperty("webdriver.gecko.driver","/Users/waqaskhan/Downloads/geckodriver");
		 driver = new FirefoxDriver();
	}
	
	

}
