package testNG.priority;

import org.testng.annotations.Test;

public class WithoutPriority {
   @Test(priority = 2)
    public void testScriptD(){
        System.out.println("Test Script D"); }
    @Test(priority = 1)
    public void testScriptA(){
        System.out.println("Test Script A");}
    @Test(priority = -3) //we can declare priority as minus
    public void testScriptB(){
        System.out.println("Test Script B"); }
    @Test(priority = 5)
    public void testScriptC(){
        System.out.println("Test Script C");
    }
    @Test(priority = 0)
    public void testScriptE(){
        System.out.println("Test Script E"); }
    @Test(priority = 0) // we cant declare priority as 0
    public void testScriptF(){
        System.out.println("Test Script F");  }
    @Test(priority = 'a')
    public void testScriptI(){
        System.out.println("Test Script I");
    }
  /*  @Test(priority = 11.5) //we cant declare priority as float
    public void testScriptG(){
        System.out.println("Test Script G");
    }  */
}
