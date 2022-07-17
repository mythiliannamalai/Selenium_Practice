package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@Test
	public void Frames_Function() throws InterruptedException {		
		driver.get("file:///C:/Users/user/Desktop/mythili%20note%20pad/QA%20Meterial/Page2.html");	
		driver.manage().window().maximize();
		driver.switchTo().frame(0);		
	    driver.findElement(By.id("t1")).sendKeys("Mythili");
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("t2")).sendKeys("23");
	    Thread.sleep(2000);
	   //driver.close();
	}	
	
}
