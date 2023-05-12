package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");

		WebElement firstName = driver.findElement(By.id("input-firstname"));

		WebElement LastName = driver.findElement(By.id("input-lastname"));

		WebElement Email = driver.findElement(By.id("input-email"));
		
		String text=firstName.getAttribute("placeholder");
		
		System.out.println(text);
		
		String Idtext=firstName.getAttribute("id");
		
		System.out.println(Idtext);
		
		String emailId=doGetAttribute(Email, "id");

		System.out.println(emailId);
	}
	
	
	public static String doGetAttribute(WebElement element, String value) {
		return element.getAttribute(value);
	}

}
