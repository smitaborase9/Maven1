package testNG.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void case1(){
        System.out.println("case1");
    }
    @Test
    public void case2(){
        System.out.println("case2");
    }
    @AfterMethod
    public void aftermethodExample(){
        System.out.println("After method");
    }

}

