package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_CreateAccount {
public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
@Test
public void Gmail_AccountCreation() throws InterruptedException {
	//WebDriver driver = new ChromeDriver();
	  driver.get("https://www.Gmail.com/");	
	  driver.manage().window().maximize();
	  //Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Create account']")).click();
	  driver.findElement(By.xpath("//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c']")).click();
	  WebElement email=driver.findElement(By.xpath("//input[@id='firstName']"));
	  email.sendKeys("Mythili");
	  WebElement ln=driver.findElement(By.xpath("//input[@id='lastName']"));
	  ln.sendKeys("Naveenkumar");
	  WebElement username=driver.findElement(By.xpath("//input[contains(@name,'Usern')]"));
	  username.sendKeys("mythilinaveenkumar45");
	  WebElement password=driver.findElement(By.xpath("//input[@name='Passwd']"));
	  password.sendKeys("mylikanna45");
	  WebElement Cpassword=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	  Cpassword.sendKeys("mylikanna45");
	  driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	  Thread.sleep(2000);
	  //driver.close();
}
@Test
public void Gmail_UserLogin() throws InterruptedException {		  
	driver.get("https://www.Gmail.com/");	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mythilinaveenkumar45@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("mylikanna45");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.close();
	}	
}
