package Selenium.Selenium;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action_Class_Methods {
public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test
	public void Using_contextClick_Method() throws InterruptedException{		
	 driver.get("https://www.facebook.com/");	
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
	  Actions actions = new Actions(driver);
	  actions.contextClick(MobNum).perform();
	  Thread.sleep(2000);
	  driver.close();
	  
	 
	}
	@Test
	public void Using_DragAndDrop_Method() throws InterruptedException{	
		 driver.get("https://jqueryui.com/droppable");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.switchTo().frame(0);
		  WebElement src =driver.findElement(By.id("draggable"));
		  WebElement des =driver.findElement(By.xpath("//p[text()='Drop here']"));
		  Thread.sleep(2000);
		  Actions actions = new Actions(driver);
		  actions.dragAndDrop(src, des).perform();
//		  actions.moveToElement(src).clickAndHold().perform();
//		  actions.release(des).perform();
		  driver.close();
	}
	@Test
	public void Using_DoubleClick_Method() throws InterruptedException{				 
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  Actions actions = new Actions(driver);
		  WebElement MobNum = driver.findElement(By.id("email"));
		  WebElement Pass = driver.findElement(By.name("pass"));
		  actions.doubleClick(Pass).perform();
		  Thread.sleep(2000);
		  actions.doubleClick(MobNum).perform();
		  Thread.sleep(2000);
		  driver.close();
	}
	@Test
	public void Keyboard_Method() throws InterruptedException, IOException, AWTException {		
	  driver.get("https://www.facebook.com/");	
	  driver.manage().window().maximize();
	  Thread.sleep(2000);		 
	  WebElement element = driver.findElement(By.partialLinkText("Forgotten password"));
	  Actions actions = new Actions(driver);
	  actions.contextClick(element).perform();
	  actions.sendKeys(Keys.DOWN).perform();
	  actions.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(4000);
	  driver.close();
	}
	@Test
	public void Using_Google_ShortCut() throws InterruptedException, IOException, AWTException {	
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement search = driver.findElement(By.name("q"));
	  Actions action = new Actions(driver);
	  action.sendKeys("selenium").perform();
	  Thread.sleep(2000);	  
	  action.keyDown(Keys.CONTROL).sendKeys("A").perform();	  
	  action.keyUp(Keys.CONTROL).perform();
	  Thread.sleep(2000);
	  action.keyDown(Keys.CONTROL).sendKeys("c").perform();	
	  action.keyUp(Keys.CONTROL).perform();
	  Thread.sleep(2000);
  	  action.keyDown(Keys.CONTROL).sendKeys("t").perform();	
	  action.keyUp(Keys.CONTROL).perform();
	  Thread.sleep(2000);
	  action.keyDown(Keys.CONTROL).sendKeys("v").perform();	 
	  action.keyUp(Keys.CONTROL).perform();
      Thread.sleep(2000);
      action.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  driver.close();
	}
	
}
