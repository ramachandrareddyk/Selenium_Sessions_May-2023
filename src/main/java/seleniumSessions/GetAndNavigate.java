package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAndNavigate {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println(driver.getTitle());

	}

}
