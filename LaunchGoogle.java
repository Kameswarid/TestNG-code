package retryTestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchGoogle {
	
	@Test(retryAnalyzer=retryTestcase.Retry_Logic1.class)
	public void launch()
	{

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement e1= driver.findElement(By.linkText("Gmailll"));
	e1.click();
}
}
