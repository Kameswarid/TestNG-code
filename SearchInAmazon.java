package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchInAmazon {
@DataProvider(name="set1")
public Object[][] method()
{
	return new Object[][] {{"box"},{"caps"},{"dress"},{"laptops"},{"carrots"},{"fridge"},{"pens"},{"34"}};
}

@Test(dataProvider="set1")
public void search(String input) throws InterruptedException
{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

WebElement search=driver.findElement(By.name("field-keywords"));
search.sendKeys(input+Keys.ENTER);
Thread.sleep(2000);
driver.quit();
}
}