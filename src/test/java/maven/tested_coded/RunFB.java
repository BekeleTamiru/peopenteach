package maven.tested_coded;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RunFB {
	 WebDriver driver=null;
	
		@BeforeClass
		void rubrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bekele\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		}
		
       	
       	@Test
       	void run() {
       		BeginPageFB exc = PageFactory.initElements(driver, BeginPageFB.class);
       		exc.longin("bekele", "abc123","bk@gmail.com","Aug","23");
       		
       		
       	}
       	
} 	