package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {


	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		ElementUtilities.pageloadTimeOut(driver, 20);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Applay for only webElements
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));

		
	}

}
