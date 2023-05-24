package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScrollConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavaScriptUtils.pageDown(driver);
		//WebElement element=driver.findElement(By.xpath("//span[normalize-space()='Best Sellers in Clothing & Accessories']"));
		
		//JavaScriptUtils.scrollToView(driver, element);
		
		Thread.sleep(2000);
		
		JavaScriptUtils.pageScrollUp(driver);

	}

}
