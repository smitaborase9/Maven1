package testNG.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGExample {
public  WebDriver driver;
@BeforeMethod
   public void beforeMethodExample(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
    driver=new ChromeDriver();
}
    @Test
    public void testcase1(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println("hello everyone .... Good Morning");

    }
    @Test
    public void testcase2(){
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
       driver.manage().window().maximize();
       driver.manage().window().maximize();
    }
    @Test
    public void testcase3(){
        driver.get("https://camposcoffee.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethodExample(){
    driver.close();
    }

}
