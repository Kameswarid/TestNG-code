package AnnotationsOrder;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6 {
@BeforeMethod
public void bm()
{
	System.out.println("bm");
}
@Test
public void testmethod()
{
	System.out.println("test1");
}
@Test
public void testmethod2()
{
	System.out.println("test2");
}

@AfterMethod
public void aftermethod()
{
	System.out.println("am");
}
@Test
public void test3()
{
	System.out.println("test3");
}
}

