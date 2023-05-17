package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		ElementUtilities.pageloadTimeOut(driver, 20);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Applay for only webElements
		
		WebElement AlertButton=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		
		//AlertButton.click();
		
		/*
		 * WebDriverWait wait= new WebDriverWait(driver, 20);
		 * 
		 * wait.until(ExpectedConditions.alertIsPresent());
		 */
		
		/*
		 * ElementUtilities.waitForAlert(driver, 20);
		 * 
		 * driver.switchTo().alert().accept();
		 */
		driver.navigate().to("https://demoqa.com/dynamic-properties");
		
		//driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]")).click();
		
		//driver.findElement(By.xpath("//span[normalize-space()='Dynamic Properties']")).click();
		
		WebElement Buttn1=driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		
		ElementUtilities.waitForElementVisable(driver, 20, Buttn1);
		
		//Buttn1.click();
		

		
	

	}

}
