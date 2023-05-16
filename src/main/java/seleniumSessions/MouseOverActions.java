package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverActions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement Fashion= driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(Fashion).perform();
	}

}
