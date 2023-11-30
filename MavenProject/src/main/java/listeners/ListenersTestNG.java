package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersTestNG implements IRetryAnalyzer {
	private int count = 0;
	private int maxCount = 10;


	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
