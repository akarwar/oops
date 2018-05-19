package oopsPractics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Example of Abstraction
public class diffLogin extends Base {
	
	static String FirstName = "Waqas";
	static String MiddleName = "U";
	static String LastName = "Khan";
	static String Email = "abc@example.com";
	static String Contact = "7034323233";
	
	public static void main (String[] args) {
		browserSetup();
		addCandidate();
		tearDown();
		browserSetup();
		addEmployee();
		tearDown();
	}
	public static void addCandidate() {
		test login = new test();
		login.login();
		driver.findElement(By.xpath("//b[contains(.,'Recruitment')]")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.id("addCandidate_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("addCandidate_middleName")).sendKeys(MiddleName);
		driver.findElement(By.id("addCandidate_lastName")).sendKeys(LastName);
		driver.findElement(By.id("addCandidate_email")).sendKeys(Email);
		driver.findElement(By.id("addCandidate_contactNo")).sendKeys(Contact);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		System.out.println(driver.getCurrentUrl());
		
	}
	public static void addEmployee() {
		test login = new test();
		login.login();
		driver.findElement(By.xpath("//b[contains(.,'PIM')]")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(MiddleName);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		System.out.println(driver.getCurrentUrl());
	}
	public static void tearDown() {
		driver.quit();
	}
}
