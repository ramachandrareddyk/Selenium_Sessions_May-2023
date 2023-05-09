package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\eclipse-workspace\\SeleniumSessions_May_2023\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com");
		
		//driver.get("www.facebook.com");//InvalidArgumentException
		
		driver.get("https://facebook.com");
		
		//Get Current page Ttitle
		String title=driver.getTitle();
		
		System.out.println(title);
		
		//Get Cuurrent page URL
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		//Get Current page source code
		String SourceCode=driver.getPageSource();
		System.out.println(SourceCode);
		
		
		Thread.sleep(3000);
		
		//Close the browser
		//driver.close();
		driver.quit();

	}

}
