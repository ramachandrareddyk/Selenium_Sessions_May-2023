package seleniumSessions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement>links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
		
			String link=links.get(i).getAttribute("href");
			
			verifyLinks(link);
		
		}
		

	}
	
	public static void verifyLinks(String url) {
		try {
			URL link= new URL(url);
			
			HttpURLConnection http=(HttpURLConnection)link.openConnection();
			
			http.setConnectTimeout(2000);
			
			http.connect();
			
			if(http.getResponseCode()==200) {
				System.out.println(link+" "+http.getResponseMessage());
			}
			
			if(http.getResponseCode()==400) {
				System.out.println(link+" "+http.getResponseMessage());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
