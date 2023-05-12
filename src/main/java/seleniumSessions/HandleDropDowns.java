package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String Expectefdtext="Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement createNewAccountLink= driver.findElement(By.linkText("Create new account"));
		
		ElementUtilities.Click(createNewAccountLink);
		
		Thread.sleep(3000);
		
		WebElement day=driver.findElement(By.id("day"));
		
		//Select se= new Select(day);
		
		//se.selectByVisibleText("24");
		
		//se.selectByIndex(24);
		
		//se.selectByValue("24");
		
		ElementUtilities.doSelectByVisableText(day, "25");
		
		

	}

}
