package basics.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LaunchBrowsers {
@Test
public void Facebook() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
/*	driver.get("https://www.facebook.com/");
	WebElement un=driver.findElement(By.id("email"));
	un.sendKeys("kameswari.duvvuri@yahoo.com");
	Thread.sleep(2000);
	
	WebElement pwd=driver.findElement(By.id("pass"));
	pwd.sendKeys("Srinarayana");
	Thread.sleep(2000);
	
	WebElement clk=driver.findElement(By.name("login"));
	clk.click();
	*/
	
	//Amazon
	/*
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement e1=driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
	Actions hover=new Actions(driver);
	hover.moveToElement(e1).perform();
	Thread.sleep(2000);
	WebElement e2=driver.findElement(By.xpath("//span[.=\"Sign in\"]"));
	e2.click();
	Thread.sleep(2000);
	WebElement e3=driver.findElement(By.id("ap_email"));
	e3.sendKeys("9849151263");
	WebElement e4=driver.findElement(By.id("continue"));
	e4.click();
	*/
	//Flipkart
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//span[.=\"Login\"]"));
	e1.click();
	
	WebElement e2=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
	e2.sendKeys("duvvurik@gmail.com");
	
	WebElement e3=driver.findElement(By.xpath("//button[.='Request OTP']"));
	e3.click();
	
}
}
