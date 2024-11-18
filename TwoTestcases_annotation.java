package AnnotationsOrder;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTestcases_annotation {


@BeforeMethod
public void bm()
{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
}

@Test
public void Test1() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("bags");
	Thread.sleep(4000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
}
@Test
public void Test2() throws InterruptedException
{
ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("bags"+Keys.ENTER);
	WebElement e2=driver.findElement(By.className("s-image"));
	e2.click();
	Thread.sleep(4000);
	Set<String> s1=driver.getWindowHandles();
	Iterator i1=s1.iterator();
	String parentid=(String) i1.next();
	String childid=(String) i1.next();
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	WebElement e3=driver.findElement(By.linkText("Add to Wish List"));
	e3.click();
}
@AfterMethod
public void am()
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.quit();
}
}
