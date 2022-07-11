package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook_Reg_Login {
	public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
		@Test
		public void NewUser_Registration() throws InterruptedException {		
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Create New Account")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("firstname")).sendKeys("Mythili");
		  driver.findElement(By.name("lastname")).sendKeys("Naveenkumar");
		  driver.findElement(By.name("reg_email__")).sendKeys("9600474622");
		  Thread.sleep(2000);  
		  driver.findElement(By.id("password_step_input")).sendKeys("Mylikanna45");
		  WebElement element1 = driver.findElement(By.name("birthday_day"));
		  Select day = new Select(element1);
		  day.selectByIndex(20);
		  WebElement element2 = driver.findElement(By.name("birthday_month"));
		  Select Month = new Select(element2);
		  Month.selectByValue("5");
		  WebElement element3 = driver.findElement(By.name("birthday_year"));
		  Select year = new Select(element3);
		  year.selectByVisibleText("1999");
		  Thread.sleep(2000);
		  WebElement element = driver.findElement(By.className("_58mt"));
		  element.click();		  
		  driver.findElement(By.name("websubmit")).click();	  
		  Thread.sleep(2000);
		  driver.close();
		}
		@Test
		public void User_Login() throws InterruptedException {		  
			driver.get("https://www.facebook.com/");	
			driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
		  MobNum.sendKeys("9600474622");
		  Thread.sleep(2000);
		  MobNum.clear();
		  Thread.sleep(2000);
		  MobNum.sendKeys("9600474622");
		  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		  Password.sendKeys("Mylikanna45");
		  driver.findElement(By.xpath("//button[@name='login']")).submit();
		  Thread.sleep(2000);
		  driver.close();	 
		}	
		
		
}
