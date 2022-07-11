package Selenium.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robot_Class_Mouse_Keybord_Opration {
public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}	
		@Test
		public void Using_RobotClass() throws InterruptedException, IOException, AWTException {		
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		  Robot robot= new Robot();
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='email']"))));		 
		 robot.mouseMove(100, 300);		 
		 robot.mouseWheel(2);		
		 robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		 robot.keyPress(KeyEvent.VK_M);
		 robot.keyRelease(KeyEvent.VK_M);
		 robot.keyPress(KeyEvent.VK_Y);
		 robot.keyRelease(KeyEvent.VK_Y);
		 Thread.sleep(2000);
		 driver.close();
		}
		
}
