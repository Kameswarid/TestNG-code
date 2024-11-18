package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_Login_SearchProduct {

	@Test
	public void AmazonLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream f1=new FileInputStream("D:\\Selnium\\SeleniumStart\\DataSheetxl\\Mysheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		
String un=		w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
String pwd= w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
String items= w1.getSheet("Login").getRow(2).getCell(2).getStringCellValue();


ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
/* Login Amazon with ddt username and password
 * 
WebElement e1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
Actions a1=new Actions(driver);
a1.moveToElement(e1).perform();
Thread.sleep(3000);

WebElement e2= driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
e2.click();
Thread.sleep(2000);

WebElement e3= driver.findElement(By.name("email"));
e3.sendKeys(un);
Thread.sleep(3000);

WebElement e4= driver.findElement(By.id("continue"));
e4.click();
Thread.sleep(4000);

WebElement e5= driver.findElement(By.name("password"));
e5.sendKeys(pwd);
Thread.sleep(3000);

WebElement e6= driver.findElement(By.id("auth-signin-button"));
e6.click();
Thread.sleep(3000);
*/

//Searcg prodcuts from the ddt

WebElement search=driver.findElement(By.name("field-keywords"));
search.sendKeys(items+Keys.ENTER);
Thread.sleep(2000);
//driver.quit(); 
	}
}
