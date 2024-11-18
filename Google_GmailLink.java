package basics.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_GmailLink {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	/*driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Gmail")).click();
	//WebElement e2= driver.findElement(By.xpath(//a[@class="gb_X")); */
	driver.get("https://www.amazon.in/");
	WebElement e1= driver.findElement(By.className("nav-line-1 nav-progressive-content"));
	e1.click();
	WebElement e2= driver.findElement(By.linkText("Sign in"));
	e2.click();
}
}
