package retryTestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic1 implements IRetryAnalyzer {

	int initialCount=0;
	int retryCount=2;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(initialCount<retryCount)
		{
			initialCount++;
			return true;
			
		}
		return false;
	}

}
