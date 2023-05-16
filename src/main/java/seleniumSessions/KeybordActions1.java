package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeybordActions1 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement name= driver.findElement(By.id("userName"));
		
		WebElement email= driver.findElement(By.id("userEmail"));
		
		WebElement currentAddress= driver.findElement(By.id("currentAddress"));
		
		WebElement PermenentAddress= driver.findElement(By.id("permanentAddress"));
		
		WebElement submit= driver.findElement(By.id("submit"));
		
		name.sendKeys("Ramachandra");
		
		name.sendKeys(Keys.TAB);
		
		email.sendKeys("ramureddy4555@gmail.com");
		
		email.sendKeys(Keys.TAB);
		
		currentAddress.sendKeys("Bangalore, Mahadevapura, 560048");
		
		currentAddress.sendKeys(Keys.CONTROL,"a");
		
		currentAddress.sendKeys(Keys.CONTROL,"c");
		
		currentAddress.sendKeys(Keys.TAB);
		
		PermenentAddress.sendKeys(Keys.CONTROL,"v");
		
		
		
	}

}
