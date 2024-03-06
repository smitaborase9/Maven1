package testNG.paramerization;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {
    @DataProvider(name = "test-Data")
    public Object[][] dataProviderFunction() throws IOException {
        Object[][] arrObj=getExcelData("C:\\Users\\prash\\OneDrive\\Documents\\DataProvider.xlsx", "TestCase");
        return arrObj;
    }
public String[][]getExcelData(String fileName , String sheetName) throws IOException {
    FileInputStream fileInputStream=new FileInputStream(fileName);
    XSSFWorkbook wb= new XSSFWorkbook(fileInputStream);
    XSSFSheet sh=wb.getSheet(sheetName);
    XSSFRow row=sh.getRow(0);
    int noOfRow=sh.getPhysicalNumberOfRows();
    int noOfColumn=row.getLastCellNum();
    Cell cell;
   String[][] data=new String[noOfRow-1][noOfColumn];

   for (int i =1; i <= noOfRow-1; i++){
       for (int j=0; j<noOfColumn ; j++){
           row= sh.getRow(i);
           cell=row.getCell(j);
           data[i - 1][j] = cell.getStringCellValue();
       }
   }
   return data;
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
        //Thread.sleep(3000);
        driver.close();
    }
}
