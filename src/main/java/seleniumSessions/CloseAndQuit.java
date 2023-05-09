package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\eclipse-workspace\\SeleniumSessions_May_2023\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		String title=driver.getTitle();
		//it will close only Browser not session id
		//driver.close();//NoSuchSessionException: invalid session id
		
		//it will close browser and session id
		driver.quit();//NoSuchSessionException: Session ID is null
		
		driver.getTitle();

	}

}
