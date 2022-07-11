package Selenium.Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Child_Browser_PopUp {
public WebDriver driver;
@BeforeTest
public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void Close_Parent_Window() throws InterruptedException {
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	String ParentId = driver.getWindowHandle();
	System.out.println("Parent id :"+ParentId);
	driver.findElement(By.linkText("Register now")).click();
	Set<String> AllWindow = driver.getWindowHandles();
	int count= AllWindow.size();
	System.out.println("Number of window open in the system :"+count);
   for(String windowHandle : AllWindow) {
	   driver.switchTo().window(windowHandle);  	   
	   if(windowHandle.equals(ParentId)) {
		   driver.close();
	   }
   }   
   }
@Test
public void Close_All_Chile_Window() {
	   driver.get("https://www.naukri.com/");
	   driver.manage().window().maximize();
	   String Parent = driver.getWindowHandle();
	   driver.findElement(By.linkText("Register now")).click();
	   Set<String> AllWindow = driver.getWindowHandles();
	   int size = AllWindow.size();
	   for(String windowHandle : AllWindow) {
		   driver.switchTo().window(windowHandle);
		   if(!windowHandle.equals(Parent)) {
			   driver.close();
		   }
	   }
	   
			   
}
}

