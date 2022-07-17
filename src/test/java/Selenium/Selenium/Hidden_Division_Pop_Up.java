package Selenium.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hidden_Division_Pop_Up {
public WebDriver driver;
@BeforeTest
public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void Hidden_PopUp() throws InterruptedException {
	driver.get("https://www.cleartrip.com/");
	//driver.findElement(By.xpath("//path[@d='M18 6L12 12M12 12L6 18M12 12L6 6M12 12L18 18']")).click();
	driver.findElement(By.xpath("//div[text()='Sat, Jul 9']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='24']")).click();
	Thread.sleep(2000);
}

}
