package testNG.retryAbalyzer;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyzerExample implements IRetryAnalyzer {

    private int retryCount=0;
    private static final int maxRetrycount=3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount< maxRetrycount){
            retryCount++;
            return  true;
        }
        return false;
    }
}
