package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearText {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		By Username=By.id("email");
		
		By Password=By.id("pass");
		
		By loginBtn=By.name("login");
		
		/*
		 * getWebelement(Username).sendKeys("Manager");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * getWebelement(Username).clear();
		 * 
		 * getWebelement(Username).sendKeys("Ramachandra");
		 * 
		 * getWebelement(Password).sendKeys("Test@123");
		 * 
		 * getWebelement(loginBtn).click();
		 */

		clearText(Username);
		
		enterText(Username, "Ramachandra");
		
		clearText(Password);
		
		enterText(Password, "Test@123");
		
		Click(loginBtn);
	}
	
	public static WebElement getWebelement(By Locater) {
		WebElement element= driver.findElement(Locater);
		
		return element;
	}
	
	public static void enterText(By locater, String Value) {
		getWebelement(locater).sendKeys(Value);
	}
	
	public static void clearText(By locater) {
		getWebelement(locater).clear();
	}
	
	public static void Click(By locater) {
		getWebelement(locater).click();
	}

}
