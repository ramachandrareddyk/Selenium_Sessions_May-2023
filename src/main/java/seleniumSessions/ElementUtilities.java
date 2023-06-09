package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtilities {
	
	
	WebDriver driver;
	public static String doGetAttribute(WebElement element, String value) {
		return element.getAttribute(value);
	}

	public static boolean doIsDisplay(WebElement Ele) {
		return Ele.isDisplayed();
	}
	
	public static String doGetText(WebElement element) {
		return element.getText();
	}
	
	
	public static void enterText(WebElement element, String Value) {
		element.sendKeys(Value);
	}
	
	public static void clearText(WebElement element) {
		element.clear();
	}
	
	public static void Click(WebElement element) {
		element.click();
	}
	
	public static void doSelectByVisableText(WebElement element, String Value) {
		Select se= new Select(element);
		
		se.selectByVisibleText(Value);
	}
	
	public static void doSelectByValue(WebElement element, String Value) {
		Select se= new Select(element);
		
		se.selectByValue(Value);
	}
	
	
	public static void doSelectByIndex(WebElement element, int Value) {
		Select se= new Select(element);
		
		se.selectByIndex(Value);
	}
	
	public static List<WebElement> DogetAllOptions(WebElement element) {
		Select se= new Select(element);
		
		return se.getOptions();
	}
	
	public static void switchIntoFrameUsingName(WebDriver driver,String FrameName) {
		driver.switchTo().frame(FrameName);
	}
	
	public static void switchIntoFrameUsingIndex(WebDriver driver,int FrameIndex) {
		driver.switchTo().frame(FrameIndex);
	}
	
	public static void switchIntoFrameUsingWebElement(WebDriver driver,WebElement Frame) {
		driver.switchTo().frame(Frame);
	}
	
	public static void switchInToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
		}
	
	public void switchInToTab(WebDriver driver,int index) {
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
	}
	
	public static void doRightClick(WebDriver driver, WebElement Element) {
		Actions act= new Actions(driver);
		
		act.contextClick(Element).perform();
	}
	
	public static void doDoubleClick(WebDriver driver, WebElement Element) {
		Actions act= new Actions(driver);
		
		act.doubleClick(Element).perform();
	}
	
	public static void doDragAndDrop(WebDriver driver, WebElement Drag, WebElement Drop) {
		Actions act= new Actions(driver);
		
		act.dragAndDrop(Drag, Drop).perform();
		
	}
	
	public static void pageloadTimeOut(WebDriver driver, int time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
	
	public static void waitForAlert(WebDriver driver, int time) {
		WebDriverWait wait= new WebDriverWait(driver, time);
		
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void waitForElementVisable(WebDriver driver, int time, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver, time);
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForElementELementToBeClickable(WebDriver driver, int time, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver, time);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForElementELementToBeSelect(WebDriver driver, int time, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver, time);
		
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

}
