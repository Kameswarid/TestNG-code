package AnnotationsOrder;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test7 {
@Test
public void test1()
{
	System.out.println("test1");
}
@BeforeMethod
public void mb()
{
	System.out.println("mb");
}
@Test
public void test2()
{
	System.out.println("test2");
}
}
