package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {
	@Test(dataProvider = "set")
	public void login_Facebook(String username, String password) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.id("email"));
		WebElement e2 = driver.findElement(By.id("pass"));
		e1.sendKeys(username);
		e2.sendKeys(password);

		// WebElement e3=driver.findElement(By.name("login"));
		// e3.click();
	}

	@DataProvider(name = "set")
	public Object[][] method() {
		Object data[][] = new Object[3][2];
		data[0][0] = "ram@gmail.com";
		data[0][1] = "ram12@vjh";

		data[1][0] = "sam@gmail.com";
		data[1][1] = "sam123@hg";

		data[2][0] = "pam@gmail.com";
		data[2][1] = "pam123@jhl";
		return data;
		
	}

}
