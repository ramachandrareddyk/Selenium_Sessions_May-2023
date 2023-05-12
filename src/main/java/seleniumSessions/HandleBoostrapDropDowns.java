package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBoostrapDropDowns {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(10000);
		
		WebElement username= driver.findElement(By.name("username"));
		
		WebElement password=driver.findElement(By.name("password"));
		
		WebElement LoginBtn= driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		ElementUtilities.enterText(username, "Admin");
		
		ElementUtilities.enterText(password, "admin123");
		
		ElementUtilities.Click(LoginBtn);
		
		Thread.sleep(5000);
		
		WebElement Admin= driver.findElement(By.xpath("//span[text()='Admin']"));
		
		ElementUtilities.Click(Admin);
		
		Thread.sleep(2000);
		
		WebElement Qualifications=driver.findElement(By.xpath("//span[text()='Qualifications ']"));
		
		ElementUtilities.Click(Qualifications);
		
		Thread.sleep(2000);
		
		List<WebElement> QualificatioOptions=driver.findElements(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']"));
		
		SlectValueInBoostrapDropdown(QualificatioOptions,"Skills");
		
	}
	
	public static void SlectValueInBoostrapDropdown(List<WebElement>Elements, String value) {
		
		for (int i = 0; i < Elements.size(); i++) {
			String text=Elements.get(i).getText();
			
			if(value.equalsIgnoreCase(text)) {
				Elements.get(i).click();
				break;
			}
			
		}
	
	}
}
