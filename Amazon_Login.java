package basics.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//driver.findElement(By.linkText("Mobiles")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sunscreen");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}
}
