package asserts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//launch Amazon, search shoes, check if the products are added assert the products are listed (length>10 the test case passed
public class Amazon_searchShoe_VerifyPassFail {
	@Test
	public void search() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes" + Keys.ENTER);

		List<WebElement> e1 = driver.findElements(By.xpath("//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20']"
				));
		int result = e1.size();
		System.out.println(result);

		//Assert.assertEquals(result > 10, true);
		Assert.assertEquals(e1.size() > 10, true);

	}

}
