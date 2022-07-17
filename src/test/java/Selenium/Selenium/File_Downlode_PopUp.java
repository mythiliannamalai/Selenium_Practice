package Selenium.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_Downlode_PopUp {
public WebDriver driver;
@BeforeTest
public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
}
@Test
public void File_Download() throws AWTException {
	HashMap <String,Object> chromePrefs = new HashMap<String,Object>();
	chromePrefs.put("profile.default_content_settings.popups",0);
	chromePrefs.put("download.default_directory","C:\\Users\\user\\Downloads\\chromedriver_win32\\");
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs",chromePrefs);
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	cap.setCapability(ChromeOptions.CAPABILITY,options);
	driver=new ChromeDriver(cap);
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.linkText("4.3.0")).click();
//	Robot robot =new Robot();
//	robot.keyPress(KeyEvent.VK_ENTER);
	driver.close();
	
	
}
}
