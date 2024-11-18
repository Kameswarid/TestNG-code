package parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class LoginQuit {
WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameofbrowser)
	{
		if((nameofbrowser.equals("chrome")))
		{
			driver = new ChromeDriver();
		}
		if((nameofbrowser.equals("edge")))
		{
			driver = new EdgeDriver();
		}
/*	if((nameofbrowser.equals("firefox")))
		{
			driver = new MozillaFirefox();
		}*/
	}
	{
		
	}
	@AfterMethod
	public void posttest() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
}
