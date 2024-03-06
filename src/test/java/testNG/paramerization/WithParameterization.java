package testNG.paramerization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization {
    public WebDriver driver;

    @Parameters({"browserName"})
    @Test
    public void beforeMethodTestDemo(String browserName){
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions=new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Users\\prash\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
             driver=new FirefoxDriver(firefoxOptions);
        }
        else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\prash\\Downloads\\edgedriver_win32\\msedgedriver.exe ");

             driver=new EdgeDriver();
        }else {
            throw new RuntimeException("please select correct browser");
        }

    }
    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyGoogleSearch(String courseName , String cityName) throws InterruptedException {

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(courseName+ cityName);
        googleSearchBox.sendKeys(Keys.ENTER);
      //  Thread.sleep(3000);
        driver.close();
    }
}
