package testNG.paramerization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider {
@DataProvider(name = "test-Data")
public Object[][] testData(){
    return new Object[][]{
            {"Selenium","Pune"}, {"java","nasik"}, {"python","Mumbai"}
    };
}
    @Test(dataProvider ="test-Data")
    public void verifyGoogleSearch(String courseName , String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
      WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(courseName+ cityName);
        googleSearchBox.sendKeys(Keys.ENTER);
       // Thread.sleep(3000);
        driver.close();
    }
}
