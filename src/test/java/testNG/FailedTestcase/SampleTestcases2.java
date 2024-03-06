package testNG.FailedTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import testNG.retryAbalyzer.IretryAnalyzerExample;

public class SampleTestcases2 {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }
    @Test
    public void verifyLogin2(){
        Assert.assertTrue(false);
        System.out.println("Verify Login 2");
    }
    @Test
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }
    @Test
    public void verifyFundsTransfer() {
        System.out.println("Verify Funds Transfer");
    }

        @Test
        public void verifyCashbackOffer(){
            System.out.println("Verify cashback offer");
    }
}
