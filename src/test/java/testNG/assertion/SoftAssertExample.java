package testNG.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
            public void softAssertDemo() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        SoftAssert softAssert=new SoftAssert();
        WebElement loginTextbox = driver.findElement(By.id("login1"));
        softAssert.assertEquals(title,"rediffmail", "title should be match");
        softAssert.assertFalse(loginTextbox.isDisplayed(), "login textbox should be display");
        System.out.println("Hello");
        softAssert.assertAll();
        driver.close();
        /*
        In soft asserts, the subsequent assertions keep on running even though one assert validation fails, i.e., the
         test execution does not stop.
Soft assert does not include by default in TestNG. For this, you need to include the package org.testng.asserts.Softassert.

         */
    }
}
