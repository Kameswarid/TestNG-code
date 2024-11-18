package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

	@DataProvider(name="Set1")
		public Object[][] GoogleSearch()
		{
			return new Object[][] {{"Singapore"},{"USA"},{"UK"}};
			
		}
	@DataProvider(name="Set2")
	public Object[][] SearchPerson()
	{
		return new Object[][] {{"Ratan Tata"},{"Modi"}};
	}
/*	@DataProvider(name="Set3")
	public Object[][] numbers()
	{
		return new Object[][] {{23},{34},{345}};
	}
	@Test(dataProvider="Set3")
	
		public void add(int input)
		{
			int sum=100+input;
			//System.out.println(sum);
			Reporter.log("Sum is -->"+sum);
		}*/
	
	
	@Test(dataProvider="Set2")
	public void methodSearch(String input)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys(input+Keys.ENTER);
	}
}

