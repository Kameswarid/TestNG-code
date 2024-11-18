package basics.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_HtmlFile {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Downloads/Learning.html");
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	//WebElement e1=driver.findElement(By.tagName("a"));
	//e1.click();
	WebElement e2=driver.findElement(By.xpath("(/html/body/input)[1]"));
	e2.sendKeys("Kameswari");
	
	WebElement e3=driver.findElement(By.xpath("((/html/body/input)[2])"));
	e3.sendKeys("Hello");
	
	WebElement e4=driver.findElement(By.xpath("(/html/body/input)[3]"));
	e4.sendKeys("pwd");
	
	WebElement e5=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
	e5.sendKeys("FirstName");
	
	WebElement e6=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
	e6.click();
	
	/*WebElement e7=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
	e7.click();
	
	WebElement e8=driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
	e8.click();*/
	WebElement e9=driver.findElement(By.xpath("(/html/body/input)[4]"));
	e9.click();
	
//	WebElement e10=driver.findElement(By.xpath("(/html/body/input)[5]"));
//	e10.click();
	
	WebElement e11=driver.findElement(By.xpath("(/html/body/input)[6]"));
	e11.click();
	
	WebElement e12=driver.findElement(By.xpath("(/html/body/a)"));
	e12.click();
	}
}
