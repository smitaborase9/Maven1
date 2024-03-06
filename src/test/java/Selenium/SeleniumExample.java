package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

    }
}
/*
groupId:  Generally, groupId refers to domain id. For best practices company name is used as groupId. It identifies the
 project uniquely. company name like [pom.google]

artifactId: It is basically the name of the Jar without version. we can also call it name of container where we storing
dependencies
version: This tag is used to create a version of the project.
Local repository: Maven downloads all the required dependencies and stores in the local repository called .m2

Build Life Cycle

clean: deletes all artifacts and targets which are created already.
compile: used to compile the source code of the project.
test: test the compiled code and these tests do not require to be packaged or deployed.
package: package is used to convert your project into a jar or war etc.
install: install the package into the local repository for use of another projec

 */