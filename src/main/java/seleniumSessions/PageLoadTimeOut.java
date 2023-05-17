package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOut {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");//25
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		ElementUtilities.pageloadTimeOut(driver, 20);
		
		driver.navigate().to("https://www.myntra.com");
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		ElementUtilities.pageloadTimeOut(driver, 20);
		
		

	}

}
