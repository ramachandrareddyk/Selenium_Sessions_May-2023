package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locaters {

	static WebDriver driver;
	//1. id ---> Second fastest Locater  -->1
	//2. Name--->2
	//3. Class Name
	//4. CSS Selector    ---> Fastet locater
	//5. Xpath--->3
	//6. Tag name
	//7. Link Text
	//8. Partial Link Text
	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//id- Static valu/Unique for each element
		
		
		System.out.println("------------Using WebElemet-----------");
		/*
		 * WebElement Username= driver.findElement(By.id("email"));
		 * 
		 * Username.sendKeys("Testing");
		 */
		
		//driver.findElement(By.id("email")).sendKeys("Manger");
		
		System.out.println("------------Using By Locater-----------");
		/*
		 * By Username=By.id("email");
		 * 
		 * driver.findElement(Username).sendKeys("Sr test Engeneer");
		 * 
		 * WebElement Username1=driver.findElement(Username);
		 */
		
		System.out.println("------------Using String-----------");
		/*
		 * String id="email";
		 * 
		 * driver.findElement(By.id(id)).sendKeys("Test Engineer");
		 */
		/*
		 * By Username=By.id("email"); 
		 * getEbelement(Username).sendKeys("Mahesh");
		 */
		
		
		//2. Name
		
		/*
		 * driver.findElement(By.name("email")).sendKeys("Lokesh");
		 * 
		 * WebElement Username=driver.findElement(By.name("email"));
		 * 
		 * By userEmail= By.name("email");
		 * 
		 * getWebelement(userEmail).sendKeys("User");
		 */
		
		
		//3. Class Name
		
		/*
		 * driver.findElement(By.className("inputtext")).sendKeys("Username");
		 * 
		 * WebElement username=driver.findElement(By.className("inputtext"));
		 * 
		 * By User1= By.className("inputtext");
		 * 
		 * WebElement userName= getWebelement(User1);
		 */
		
		
		//4. CSS Selector - Cascading Style sheets
		/*
		 * driver.findElement(By.cssSelector("#email")).sendKeys("TesUser");
		 * 
		 * WebElement userEmail=driver.findElement(By.cssSelector("#email"));
		 * 
		 * By user= By.cssSelector("#email");
		 * 
		 * WebElement elem= getWebelement(user);
		 */
		
		//5. xpath
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("UserText");
		 * 
		 * WebElement userEmail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 * 
		 * By username1= By.xpath("//*[@id='email']");
		 */
		
		//6. Tag name
		
		//driver.findElement(By.tagName("button")).click();
		
		//7. Link text
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.linkText("Create new account")).click();
		
		//8. Partial Link text
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.partialLinkText("Create")).click();
	}
	
	public static WebElement getWebelement(By Locater) {
		WebElement element= driver.findElement(Locater);
		
		return element;
	}

}
