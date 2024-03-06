package testNG.annotations;

import org.testng.annotations.Test;

public class InvocationTimeout {
    @Test(invocationCount = 1000 , invocationTimeOut = 1)
    public void invocationCount(){
        System.out.println("invocation Count Method");
    }
}
