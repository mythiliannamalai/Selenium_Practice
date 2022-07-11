package Selenium.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto_Suggestion_ListBox {
public WebDriver driver;
@BeforeTest
public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@Test
public void Auto_Sugg_ListBox() {
driver.get("https://www.google.com/");	
driver.manage().window().maximize();
WebElement element= driver.findElement(By.name("q"));
element.sendKeys("Selenium");
List<WebElement> list =driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
int count = list.size();
System.out.println("List option count :"+count);
String expectedValue="selenium download";
for (WebElement option : list) {
String text = option.getText();
System.out.println(" "+text);
if (text.contains(expectedValue)) {
option.click();
break;
}
}
}
}
