package Selenium.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot {

public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
		
		System.out.println("1.Chrome Driver");
		System.out.println("2.Edeg Driver");
		System.out.println("Enter your choice of web driver :");
	    Scanner scan = new Scanner(System.in);
		int val =scan.nextInt();
				switch (val) {
				case 1:
				{
					System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
				}
				case 2:
				{
					System.setProperty("webdriver.edge.driver","C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
				}
				}
	}
	
		@Test
		public void Take_ScreenShot() throws InterruptedException, IOException {		
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
		  MobNum.sendKeys("9600474622");
		  WebElement Password = driver.findElement(By.cssSelector("#pass"));
		  Password.sendKeys("Mylikanna45");
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File SFile = ts.getScreenshotAs(OutputType.FILE);
		  File DFile = new File(".\\FaceBook_ScreenShot\\"+"Facebook6.png");
		  FileHandler.copy(SFile,DFile);
		  driver.close();
		  
		}

}
