package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalender {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		
		selectFeatureDate("July 2024", "24");
		
		
	}
	
	public static void selectFeatureDate(String ExpMonthYear, String Day) {
		
		if(Integer.parseInt(Day)<=0) {
			System.out.println("Wrong date passed "+ Day);
			
			return;
		}
		
		if(Integer.parseInt(Day)>31) {
			System.out.println("Wrong date passed "+ Day);
			
			return;
		}
		
		if(ExpMonthYear.contains("February") && Integer.parseInt(Day)>28) {
			System.out.println("Wrong date passed "+ Day);
			
			return;
		}
		
		
		String ActMonthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(ActMonthYear);
		
		while(!ActMonthYear.equalsIgnoreCase(ExpMonthYear)) {
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			
			ActMonthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(ActMonthYear);
		}
		
		selecetDate(Day);
		
	}
	
	public static void selecetDate(String Day) {
		driver.findElement(By.xpath("//a[text()='"+Day+"']")).click();
	}

}
