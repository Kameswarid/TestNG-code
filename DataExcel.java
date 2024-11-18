package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("D:\\Selnium\\SeleniumStart\\DataSheetxl\\Mysheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String un = c1.getStringCellValue();
	//	System.out.println(un);

		//Sheet s2 = w1.getSheet("Login");
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		String pwd = c2.getStringCellValue();
		//System.out.println(pwd);
		
		//public void login_Facebook(String username, String password) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

			WebElement e1 = driver.findElement(By.id("email"));
			WebElement e2 = driver.findElement(By.id("pass"));
			e1.sendKeys(un);
			e2.sendKeys(pwd);

			WebElement e3=driver.findElement(By.name("login"));
			//e3.click();
	}

}
