package AnnotationsOrder;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

@BeforeTest
public void bt()
{
	System.out.println("bt");
}
@BeforeClass
public void bc()
{
}
@BeforeMethod
public void bm()
{
}
@AfterMethod
public void am()
{
	
}
@Test
public void Testing()
{
	System.out.println("Test2");
}
}