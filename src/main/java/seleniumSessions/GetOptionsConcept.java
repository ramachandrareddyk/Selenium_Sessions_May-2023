package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptionsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String Expectefdtext="Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement createNewAccountLink= driver.findElement(By.linkText("Create new account"));
		
		ElementUtilities.Click(createNewAccountLink);
		
		Thread.sleep(3000);
		
		WebElement Month=driver.findElement(By.id("month"));
		
		Select se= new Select(Month);
		
		//List<WebElement>MonthOptions= se.getOptions();
		List<WebElement>MonthOptions=ElementUtilities.DogetAllOptions(Month);
		System.out.println(MonthOptions.size());
		
		for (int i = 0; i < MonthOptions.size(); i++) {
			String text=MonthOptions.get(i).getText();
			System.out.println(text);
		}

	}
	
	//Assignment
	//Open OrngeHRM Application https://www.orangehrm.com/en/hris-hr-software-demo/
	//Get Page Title and print
	//Verify is all ements are displaying (Book free demo Button, 
	//contact sales, full name, Business email, Country, Phone number and submit button
	//Get and print place holders for Full name, Email, Phone number
	
	//Select country as india
	
	//Country dropdown size
	//Print all the options in country dropdowm
}
