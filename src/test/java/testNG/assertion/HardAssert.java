package testNG.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
    @Test
    public void hardAssert(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals(title,"amazon", "title should be same");
       driver.close();
       //Hard Asserts are those asserts that stop the test execution when an assert statement fails, and the subsequent
        // assert statements are therefore not validated.
    }
}
