package basics.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_browserClasses {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.className("gLFyf")).sendKeys("India");
	//.click(Keys.ENTER);
	
	
	
	}
}
