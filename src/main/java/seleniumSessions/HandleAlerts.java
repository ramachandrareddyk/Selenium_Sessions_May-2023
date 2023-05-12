package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		
		  driver.findElement(By.id("alertButton")).click();
		  
		  Thread.sleep(2000);
		  
		  Alert alt= driver.switchTo().alert();
		  
		  String text=alt.getText();
		  
		  System.out.println(text);
		  
		  alt.accept();
		  
		  driver.findElement(By.id("confirmButton")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.switchTo().alert().dismiss();
		 
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert alrt=driver.switchTo().alert();
		
		alrt.sendKeys("ramureddy4555@gmail.com");
		
		Thread.sleep(2000);
		
		alrt.accept();
		
		

	}

}
