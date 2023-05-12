package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		String Expectefdtext="Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement email= driver.findElement(By.id("email"));
		 
		List<WebElement>links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			//String text=links.get(i).getText();
			
			WebElement ele= links.get(i);
			
			String text=ele.getText();
			
			System.out.println(text);
		}
	}

}
