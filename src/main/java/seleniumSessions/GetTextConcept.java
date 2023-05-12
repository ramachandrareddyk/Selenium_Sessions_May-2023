package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String Expectefdtext="Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement ele= driver.findElement(By.className("_8eso"));
		
		//String ActualText=driver.findElement(By.className("_8eso")).getText();
		
		String ActualText= doGetText(ele);
		if(ActualText.equals(Expectefdtext)) {
			System.out.println("Both are equal and test passed");
		}else {
			System.out.println("Both are not equal and test failed passed");
		}
		
		System.out.println(ActualText);
	}
	
	public static String doGetText(WebElement element) {
		return element.getText();
	}

}
