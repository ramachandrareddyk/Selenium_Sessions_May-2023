package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title=JavaScriptUtils.getTitleByJS(driver);
		
		System.out.println(title);
		
		JavaScriptUtils.sendKeysWithJS(driver, "email", "Ramachandra");
		
		JavaScriptUtils.sendKeysWithJS(driver, "pass", "Test@123");
		
		WebElement login= driver.findElement(By.name("login"));
		
		JavaScriptUtils.clickByJS(driver, login);
	}

}
