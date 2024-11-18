package basics.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver1=new EdgeDriver();
	//FirefoxDriver driver1=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	String title= driver.getTitle();
	System.out.println(title);
	//driver.quit();	
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
}
}
