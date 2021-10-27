package Org.cts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Org.Base.Baseclass;

public class Automate1 extends Baseclass {

	public static void main(String[] args) {
		
		Setup();
		launchUrl("https://www.techlistic.com/");
		
		
		WebElement javalink = driver.findElement(By.xpath("//a[text()='Java']"));
		javalink.click();
		
		
		
		WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium']"));
		selenium.click();
		
		driver.navigate().back();
		
		WebElement Testng = driver.findElement(By.xpath("//a[text()='TestNG']"));
		Testng.click();
		
		driver.navigate().back();
		
		driver.close();
		
		
		
		
	}
	
}
