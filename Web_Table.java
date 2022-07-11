package Selenium.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Web_Table {
public WebDriver driver;
@BeforeTest
public void Driver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@Test
//print the total number of ROWS present
public void Web_Table_RowsCount() {
	driver.get("file:///C:/Users/user/Desktop/mythili%20note%20pad/QA%20Meterial/Web_Table_Product.html");
	driver.manage().window().maximize();
	List<WebElement> allRow = driver.findElements(By.xpath("//tr"));
	 int RowC = allRow.size();
	System.out.println("Total Row Count : "+RowC);	
}
@Test
//print the total number of COLUMNS present
public void Web_Table_ColumnCount() {
	driver.get("file:///C:/Users/user/Desktop/mythili%20note%20pad/QA%20Meterial/Web_Table_Product.html");
	driver.manage().window().maximize();
	List <WebElement> allColumn = driver.findElements(By.xpath("//th"));
	int ColumnC=allColumn.size();
	System.out.println("Total Column Count : "+ColumnC);
}
@Test
//print the total number of CELLS present
public void Web_Table_TotalNumber_Of_Cells() {
	driver.get("file:///C:/Users/user/Desktop/mythili%20note%20pad/QA%20Meterial/Web_Table_Product.html");
	driver.manage().window().maximize();
	List <WebElement> Row =driver.findElements(By.xpath("//tr"));	
	int row = Row.size();
	List <WebElement> Colunm =driver.findElements(By.xpath("//th"));
	int column= Colunm.size();
	int totalCell = row * column;
	System.out.println("Total number of Cells : "+totalCell);
}
@Test
//print ONLY the NUMERIC values present
//Count the TOTAL number of NUMERIC values present
//print the SUM of all the numeric values in the table
public void Web_Table_PrintNumeric_Value() {
	driver.get("file:///C:/Users/user/Desktop/mythili%20note%20pad/QA%20Meterial/Web_Table_Product.html");
	driver.manage().window().maximize();
	List <WebElement> list =driver.findElements(By.xpath("//td"));
	int NumericCount=0;
	int Sum =0;
	System.out.println("List of Numeric value :");
	for(WebElement element : list)
	{
		String value = element.getText();
		try {
		int numericValue = Integer.parseInt(value);		
		System.out.println(numericValue);
		NumericCount++;
		Sum=Sum+numericValue;
		}
		catch(Exception e) {
			
		}		
	}
	System.out.println("Count of Numeric value : "+NumericCount);
	System.out.println("Sum of numberic value :"+Sum);
}

}
