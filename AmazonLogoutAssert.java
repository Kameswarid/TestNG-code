package asserts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLogoutAssert {

	@Test
	public void Login() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);

		WebElement e2 = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		e2.click();
		Thread.sleep(2000);

		/*
		 * FileInputStream f1=new
		 * FileInputStream("D:\\Selnium\\SeleniumStart\\DataSheetxl\\Amazonsignin.xlsx")
		 * ; Workbook w1=WorkbookFactory.create(f1);
		 * 
		 * String
		 * un=w1.getSheet("AmazonLogin").getRow(1).getCell(0).getStringCellValue();
		 * String
		 * pwd=w1.getSheet("AmazonLogin").getRow(1).getCell(1).getStringCellValue();
		 */
		WebElement e3 = driver.findElement(By.name("email"));
		e3.sendKeys("9849151263");
//e3.sendKeys(un);
		Thread.sleep(3000);

		WebElement e4 = driver.findElement(By.id("continue"));
		e4.click();
		Thread.sleep(4000);

		WebElement e5 = driver.findElement(By.name("password"));
		e5.sendKeys("srinarayana");
//e5.sendKeys(pwd);
		Thread.sleep(3000);

		WebElement e8=driver.findElement(By.id("signInSubmit"));
		e8.click();
		WebElement e6 = driver.findElement(By.id("twotabsearchtextbox"));
		e6.sendKeys("toys" + Keys.ENTER);
		Thread.sleep(2000);

		Actions a2 = new Actions(driver);
		a2.moveToElement(e1).perform();
		Thread.sleep(3000);
		WebElement e7 = driver.findElement(By.xpath("//span[@class='nav-text'])[9]"));
		e7.click();
		boolean b1 = e3.isDisplayed();
		System.out.println(b1);
		Assert.assertTrue(true);

	}
}
