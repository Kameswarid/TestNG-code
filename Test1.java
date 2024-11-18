package testngSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void scenario1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sunscreen");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
	}
}
