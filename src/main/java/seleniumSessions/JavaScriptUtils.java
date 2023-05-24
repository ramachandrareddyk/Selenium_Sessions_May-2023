package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {
	

	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		return js.executeScript("return document.title;").toString();
	}
	
	public static void sendKeysWithJS(WebDriver driver, String id, String value) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}
	
	public static void clickByJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void pageDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void pageDown(WebDriver driver, String height) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,'"+height+"')");
	}
	
	public static void scrollToView(WebDriver driver, WebElement Element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",Element);
	}
	
	public static void pageScrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

}
