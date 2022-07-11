package Selenium.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
		@Test
		public void ScrollUp_Function_And_MoveToElement() throws InterruptedException{		
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  System.out.println(driver.getTitle());
		  Thread.sleep(2000);
		  Actions action = new Actions(driver);		  
		  WebElement element = driver.findElement(By.linkText("Create New Account"));		  
		  Thread.sleep(2000);
		  action.moveToElement(element).click().perform();
		  Thread.sleep(2000);
		  JavascriptExecutor jsexe = (JavascriptExecutor)driver;
		  jsexe.executeScript("window.scrollBy(0,100)");
		  Thread.sleep(2000);
		  jsexe.executeScript("window.scrollBy(0,-500)");
		  Thread.sleep(2000);
		  driver.close();
		}
		@Test
		public void enter_Text_DisableFild() throws InterruptedException{		
		  driver.navigate().to("file:///C:/Users/user/Desktop/mythili%20note%20pad/QA%20Meterial/Html.html");	
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  Thread.sleep(2000);
		  js.executeScript("document.getElementById('t1').value='Mythili'");
		  Thread.sleep(2000);
		  js.executeScript("document.getElementById('t2').value=''");
		  Thread.sleep(2000);
		  js.executeScript("document.getElementById('t2').value='manager'");
		  Thread.sleep(2000);
		  js.executeScript("document.getElementById('t2').type='button'");
		}	
		
}
