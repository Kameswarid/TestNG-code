package AnnotationsOrder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 
{
@Test
public void Test()
{
}
@AfterMethod
public void am()
{
}
@BeforeSuite
public void bs()
{	
}
@AfterClass
public void as()
{
	
}
}
