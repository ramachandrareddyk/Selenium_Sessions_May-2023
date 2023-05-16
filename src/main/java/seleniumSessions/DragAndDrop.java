package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement DragEle= driver.findElement(By.id("draggable"));
		
		WebElement DropEle= driver.findElement(By.id("droppable"));
		
		
		  Actions act= new Actions(driver);
		  
		 // act.dragAndDrop(DragEle, DropEle).perform();
		 
		
		//ElementUtilities.doDragAndDrop(driver, DragEle, DropEle);
		
		  act.clickAndHold(DragEle).moveToElement(DropEle).release().build().perform();
		

	}

}
