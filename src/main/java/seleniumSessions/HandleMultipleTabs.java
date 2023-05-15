package seleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleTabs {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("tabButton")).click();
		
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.quit();

	}

}
