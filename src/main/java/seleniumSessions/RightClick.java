package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement RightClickBtn= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		/*
		 * Actions act= new Actions(driver);
		 * 
		 * act.contextClick(RightClickBtn).perform();
		 */
		ElementUtilities.doRightClick(driver, RightClickBtn);
		
		WebElement edit= driver.findElement(By.xpath("//span[text()='Edit']"));
		Thread.sleep(2000);
		
		ElementUtilities.Click(edit);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
