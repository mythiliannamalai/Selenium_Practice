package Selenium.Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_Uplode_Pop_Up {
public WebDriver driver;
@BeforeTest
public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();	
}
@Test
public void File_Upload() throws InterruptedException {
	driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='file'][@multiple='']")).sendKeys("C:\\Users\\user\\Desktop\\mythili note pad\\QA Meterial\\Selenium.txt");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();
	Thread.sleep(2000);
}
@Test
public void File_Upload_Use_AutoIt() throws InterruptedException, IOException {
	driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//preceding-sibling::input[@xpath='1']")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\AutoIT_File\\File_Uplode.exe");
//	driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();
//	Thread.sleep(2000);
}
@Test
public void File_Upload1() throws IOException, InterruptedException {
	driver.get("http://www.freepdfconvert.com/pdf-to-word");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Choose PDF file")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\AutoIT_File\\File_Uplode.exe");
}
}
