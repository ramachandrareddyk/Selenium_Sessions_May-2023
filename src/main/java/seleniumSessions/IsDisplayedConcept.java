package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedConcept {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		WebElement firstName= driver.findElement(By.id("input-firstname"));
		
		WebElement LastName= driver.findElement(By.id("input-lastname"));
		
		WebElement Email= driver.findElement(By.id("input-email"));
		
		//boolean b= firstName.isDisplayed();
		
		if(doIsDisplay(firstName)==true) {
			System.out.println("FirstName is Displayed and Test passed");
		}else {
			System.out.println("FirstName is not Displayed and Test Failed");
		}
		
		if(doIsDisplay(LastName)==true) {
			System.out.println("LastName is Displayed and Test passed");
		}else {
			System.out.println("LastName is not Displayed and Test Failed");
		}
		
		if(doIsDisplay(Email)==true) {
			System.out.println("Email is Displayed and Test passed");
		}else {
			System.out.println("Email is not Displayed and Test Failed");
		}
		

	}
	
	
	public static boolean doIsDisplay(WebElement Ele) {
		return Ele.isDisplayed();
	}

}
