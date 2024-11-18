package waits;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinks 
{
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		WebElement e1=li.get(i);
		String url=e1.getAttribute("href");
	//String s2=e1.getAttribute("href"); //gives attribute values,, can be any attribute like id,href
		//System.out.println(url);
		//System.out.println(s2);
		verifyLinks(url);
		}
	}
	static void verifyLinks(String url) throws IOException
	{
		try {
			
		URL u1=new URL(url);
		HttpURLConnection u2=(HttpURLConnection)u1.openConnection();
		if(u2.getResponseCode()==200)
		{
			System.out.println("Link is valid" + " "+url+"  "+   u2.getResponseMessage());
		}
			else
			{
				System.out.println("not valid"+" " +url+" " + u2.getResponseMessage());
			}
			}
		catch(MalformedURLException m1)
		{
			System.out.println("Handled the exception");
		}
	}
}
