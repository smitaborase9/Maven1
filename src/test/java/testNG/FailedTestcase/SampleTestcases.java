package testNG.FailedTestcase;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import testNG.retryAbalyzer.IretryAnalyzerExample;

public class SampleTestcases {
    @Test(retryAnalyzer = IretryAnalyzerExample.class)
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }
    @Test(retryAnalyzer = IretryAnalyzerExample.class)
    public void verifyLogin2(){
        Assert.assertTrue(false);
        System.out.println("Verify Login 2");
    }
    @Test(retryAnalyzer = IretryAnalyzerExample.class)
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }
    @Test(retryAnalyzer = IretryAnalyzerExample.class)
    public void verifyFundsTransfer() {
        System.out.println("Verify Funds Transfer");
    }

        @Test(retryAnalyzer = IretryAnalyzerExample.class)
        public void verifyCashbackOffer(){
            System.out.println("Verify cashback offer");
    }
}
