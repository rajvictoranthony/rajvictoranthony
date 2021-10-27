package Org.cts;

import org.apache.commons.codec.StringEncoderComparator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seliniumfirst {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.godaddy.com/");
		driver.manage().window().maximize();
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
		driver.close();
		
		String titlevalude = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		String urlValue =  "https://in.godaddy.com/";
		
		
		
		
		
		if (title.equals(titlevalude)) {
			System.out.println("Yes!! its expected result");
			
		}
		
		if (currentUrl.equals(urlValue) ) {
			System.out.println("Yes!! its expected result");
			
		}else {
				System.out.println(title);
				System.out.println(titlevalude);
				System.out.println("No this is not exptected value");
				
			}
		}
		
		
	}
		
		
