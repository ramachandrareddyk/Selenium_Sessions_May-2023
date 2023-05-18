package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIleUploadConcept {


	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement ChooseFile= driver.findElement(By.name("upfile"));
		
		ChooseFile.sendKeys("C:\\Users\\Gopi\\Desktop\\Test Scenarios Batch April.xlsx");
		
		

	}

}
