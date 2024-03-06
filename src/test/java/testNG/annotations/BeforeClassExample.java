package testNG.annotations;

import org.testng.annotations.*;

public class BeforeClassExample {
        @BeforeClass
        public void beforeClass(){
            System.out.println("before class");
        }
        @BeforeMethod
        public void beforeMethod(){
            System.out.println("Before Method");
        }
        @Test
        public void testCase1(){
            System.out.println("case1");
        }
        @Test
        public void testCase2(){
            System.out.println("case2");
        }
        @AfterMethod
        public void aftermethodExample(){
            System.out.println("After method");
        }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
    }

