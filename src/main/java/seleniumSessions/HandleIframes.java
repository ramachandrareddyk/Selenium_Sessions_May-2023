package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIframes {
static WebDriver driver;
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame("content");
		
		ElementUtilities.switchIntoFrameUsingName(driver, "content");
		
		String text=driver.findElement(By.tagName("h1")).getText();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("main");
		
		String text2=driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		
		System.out.println(text);
		
		System.out.println(text2);
		

	}

}
