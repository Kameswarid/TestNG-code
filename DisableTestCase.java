package testngSelenium;

import org.testng.annotations.Test;

public class DisableTestCase {

	@Test(priority=4)
	public void Testcase1()
	{
	}
	@Test(enabled=false,invocationCount=2)
	public void Testcase2()
	{
	}
	@Test
	public void Testcase3()
	{
	}
}
