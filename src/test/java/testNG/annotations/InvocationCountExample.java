package testNG.annotations;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 10)
    public void invocationCount(){
        System.out.println("invocation Count Method");
    }
}
