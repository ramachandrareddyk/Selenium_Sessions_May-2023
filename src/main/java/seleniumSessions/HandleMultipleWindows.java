package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindows {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> window= driver.getWindowHandles();
		
		Iterator<String>it= window.iterator();
		
		String ParentWindowid=it.next();
		
		String ChaildWindowId=it.next();
		
		driver.switchTo().window(ChaildWindowId);
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowid);
		
		System.out.println(driver.getTitle());
		
		

	}

}
