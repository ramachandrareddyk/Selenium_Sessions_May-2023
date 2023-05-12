package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtilities {
	
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

}
