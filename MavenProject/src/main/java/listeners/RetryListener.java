package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{
	
	private int count = 0 ;
	private int maxcount = 10;
	public boolean retry(ITestResult result) {
		while (count<maxcount) {
			count++;
			return true;
		}
		return false;
	}
	
}
