package oopsPractics;
import org.junit.Assert;
import org.openqa.selenium.By;

public class test extends Base {
	
	public static void main(String[] args) {
		browserSetup();
		login();
		tearDown();
	}
	
	public static void login() {
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public static void invalidCredentials() {
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("admin1");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1");
		driver.findElement(By.id("btnLogin")).click();
		String invalidMessage = driver.findElement(By.id("spanMessage")).getText();
		System.out.println(invalidMessage);
		Assert.assertEquals(invalidMessage, "Invalid ushdfish");
		
	}
	public static void tearDown() {
		driver.quit();
	}
	

}
