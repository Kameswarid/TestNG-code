package basics.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Grotech {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("Grotech minds");
	driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
	}
}
