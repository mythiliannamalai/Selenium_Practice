package Selenium.Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Select_Class {
public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
		@Test
		public void NewUser_Registration() throws InterruptedException {		
		  driver.get("file:///C:/Users/user/Desktop/mythili%20note%20pad/QA%20Meterial/Select_Class.html");	
		  driver.manage().window().maximize();
		  WebElement element=driver.findElement(By.id("mtr"));
		  Select sct=new Select(element);
		  //To check the list box is single option select list box or multi option select list box		  
		  Boolean listboxType = sct.isMultiple();
		  System.out.println("The list box is Multi select option list box :"+listboxType);
		  //Get the element count
		  List <WebElement>list = sct.getOptions();
		  int size =list.size();
		  System.out.println("Element Count :"+size);
		  //Print the all element			  		
		  for(WebElement webelement : list)
		  {
			  String text = webelement.getText();
			  System.out.println(text);					 
		  }		 	  
		  //Select by index
		  sct.selectByIndex(0);
		  //Select by value
		  sct.selectByValue("v");
		  //Select by visible text
		  sct.selectByVisibleText("POORI");
		  //Get the Selected option count
		  List <WebElement> list2 = sct.getAllSelectedOptions();
		  int size2 = list2.size();
		  System.out.println("Selected element count :"+size2);
		  //Print the selected option
		  for(WebElement webelement2 : list2)
		  {
			  String text2 = webelement2.getText();
			  System.out.println(text2);
		  }
		  //DeSelect by index
		  sct.deselectByIndex(0);
		  //DeSelect by value
		  sct.deselectByValue("v");
		  //DeSelect by visible text
		  sct.deselectByVisibleText("POORI");
		  Thread.sleep(2000);
		  //Get the First select option
		  sct.selectByValue("v");
		  sct.selectByVisibleText("POORI");
		  WebElement firstSelectElement=sct.getFirstSelectedOption();
		  String FirstSelElement=firstSelectElement.getText();
		  System.out.println("First select element :"+FirstSelElement);
		  Thread.sleep(2000);
		  //DeSelect all option
		  sct.deselectAll();	
			
		  }
		

}
