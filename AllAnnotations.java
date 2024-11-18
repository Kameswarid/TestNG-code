package testngSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
@Test
public void testcase1()
{
	System.out.println("test");
}
@BeforeSuite
public void bs()
{
	System.out.println("beforesuite");
}
@AfterSuite
public void as()
{
	System.out.println("aftersuite");
}
@BeforeTest
public void bt()
{
	System.out.println("beforetest");
}
@AfterTest
public void at()
{
	System.out.println("aftertest");
}

@BeforeClass
public void bc()
{
	System.out.println("beforeclass");
}
@AfterClass
public void ac()
{
	System.out.println("afterclass");
}
@BeforeMethod
public void bm()
{
	System.out.println("beforemethod");
}
@AfterMethod
public void am()
{
	System.out.println("aftermethod");
}
}
