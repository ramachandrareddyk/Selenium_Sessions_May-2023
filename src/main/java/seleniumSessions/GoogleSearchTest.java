package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testing tools");
		
		Thread.sleep(3000);
		
		By GoogleSuggList= By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		
		dosearch(GoogleSuggList, "testing tools name");

	}
	
	public static void dosearch(By Element, String value) {
		
		List<WebElement>sugglist= driver.findElements(Element);
		
		System.out.println(sugglist.size());
		
		for(WebElement e:sugglist) {
			
			String text=e.getText();
			if(text.contains(value)) {
				e.click();
				
				break;
			}
		}
	}

}
