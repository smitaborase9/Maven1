
package testNG.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {
    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test
    public void verifyCashBackOffer(){
        System.out.println("verify Cash Back Offer");
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }
    @Test(dependsOnGroups = {"smoke"}, alwaysRun = true)
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }
}
