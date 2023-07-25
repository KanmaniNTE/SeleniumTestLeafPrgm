package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestcases implements IRetryAnalyzer {
    int maxRetry=0;
	public boolean retry(ITestResult result) {
		if(maxRetry<1) {
			maxRetry++;
			return true;
		}
		return false;
	}

}
