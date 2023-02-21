package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class ListenersRetry implements IRetryAnalyzer {
    //Bu sinif sadece FAIL olan test caselere tekrar calistirir
    private int retryCount = 0;
    //maxRetryCount ek olarak calisma sayisi. Bu ornekte FAIL olan testler extra 1 kez daha calisir
    private static final int maxRetryCount = 1;
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
