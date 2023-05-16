package seleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement username=driver.findElement(By.id("email"));
		
		WebElement password= driver.findElement(By.id("pass"));
		
		WebElement loginbtn=driver.findElement(By.name("login"));
		
		username.sendKeys("Test User");
		
		password.sendKeys("Test@123");
		
		loginbtn.sendKeys(Keys.ENTER);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\Gopi\\eclipse-workspace\\SeleniumSessions_May_2023\\Screenshots\\"+System.currentTimeMillis()+".png"));



	}

}
