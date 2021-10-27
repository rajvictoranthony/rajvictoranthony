package Org.Base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static Robot Rob;
	
	public static void Setup() {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();	
		
	}
	public static void launchUrl(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	public static void fill(WebElement ele, String value) {	
		ele.sendKeys(value);
	}
	public static void btnclick(WebElement ele) {
		ele.click();
	}
	
	public static void currenturl() {
		driver.getCurrentUrl();
	}
	public static  void sendkeys(WebElement ele) {
		
		ele.click();	
	}
	
	public static  void thrdslep() throws InterruptedException {
		Thread.sleep(2000);

	}
	public static  void Actionitems() throws AWTException {
		
		Rob = new Robot();
		
		Rob.keyPress(KeyEvent.VK_ENTER);
		Rob.keyRelease(KeyEvent.VK_ENTER);
}
	
	
	
}
