package AnnotationsOrder;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocation_count {
@BeforeMethod
public void bm()
{
	System.out.println("bm");
}
@Test(invocationCount=10)
public void test()
{
	System.out.println("test invocation count");
}
@AfterMethod
public void am()
{
	System.out.println("am");
}

}
