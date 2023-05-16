package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBordActions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement username=driver.findElement(By.id("email"));
		
		WebElement password= driver.findElement(By.id("pass"));
		
		WebElement loginbtn=driver.findElement(By.name("login"));
		
		username.sendKeys("Test User");
		
		password.sendKeys("Test@123");
		
		loginbtn.sendKeys(Keys.ENTER);

	}

}
