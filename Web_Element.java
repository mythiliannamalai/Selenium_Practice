package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web_Element {
public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
		@Test
		public void Using_Location_Method() throws InterruptedException {		
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
		  int mobx = MobNum.getLocation().getX();
		  int moby = MobNum.getLocation().getY();
		  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		  int passx = Password.getLocation().getX();
		  int passy = Password.getLocation().getY();
		  System.out.println("Email getx :"+mobx);
		  System.out.println("Email gety :"+moby);
		  System.out.println("Password getx :"+passx);
		  System.out.println("Password gety :"+passy);
		  Thread.sleep(2000);
		  driver.close();
		}
		@Test
		public void Using_GetSize_Method() throws InterruptedException {		
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
		  int mobH = MobNum.getSize().getHeight();
		  int mobW = MobNum.getSize().getWidth();
		  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		  int passH = Password.getSize().getHeight();
		  int passW = Password.getSize().getWidth();
		  System.out.println("Email Height :"+mobH);
		  System.out.println("Email Width :"+mobW);
		  System.out.println("Password Height :"+passH);
		  System.out.println("Password Width :"+passW);
		  Thread.sleep(2000);
		  driver.close();
		}
		@Test
		public void User_Clear_And_Sendkeys_Method() throws InterruptedException {		  
			driver.get("https://www.facebook.com/");	
			driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
		  MobNum.sendKeys("9600474622");
		  Thread.sleep(2000);
		  MobNum.clear();
		  Thread.sleep(2000);
		  driver.close();
		}	
		@Test
		public void User_isEnabled_And_isDisplayed_GetText_Submit_Method() throws InterruptedException {		  
			driver.get("https://www.facebook.com/");	
			driver.manage().window().maximize();
			  WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
			  //isEnable
			  Boolean Enable= MobNum.isEnabled();			 
			  System.out.println("Email field is Enable :"+Enable);
			   MobNum.sendKeys("9600474622");
			   //isDisplayed
			   Boolean display =MobNum.isDisplayed();
			   System.out.println("Email field is displayed :"+display);
			   WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
			   Password.sendKeys("mylikanna45");
			   WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
			   //getText
			   String text= element.getText();
			   //submit
			   element.submit();			   
			   System.out.println("User states :"+text);
			   driver.close();
		}
		
		@Test
		public void Using_isSelector() throws InterruptedException {		
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
			  //TagName
			  String tagName = element1.getTagName();
			  System.out.println("Tag Name :"+tagName);			 			 
			  Select day = new Select(element1);
			  day.selectByIndex(20);
			  WebElement element2 = driver.findElement(By.name("birthday_month"));			  
			  Select Month = new Select(element2);
			  Month.selectByValue("5");		  
			  WebElement element3 = driver.findElement(By.name("birthday_year"));
			  Select year = new Select(element3);
			  year.selectByVisibleText("1999");			 
			  WebElement element = driver.findElement(By.xpath("//input[@value='1']"));
		  element.click();
		  //isSelected
		  boolean status=element.isSelected();
		  System.out.println("isSelected status :"+status);			 	  
		}
}
