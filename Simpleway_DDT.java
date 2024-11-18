package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simpleway_DDT {
@Test
public void getcellValues() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("D:\\Selnium\\SeleniumStart\\DataSheetxl\\Mysheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	
	String un=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	
	String pwd=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement e1= driver.findElement(By.id("email"));
	WebElement e2= driver.findElement(By.id("pass"));
	
	e1.sendKeys(un);
	e2.sendKeys(pwd);
	
	//System.out.println(un);
	//System.out.println(pwd);
	
}
}
