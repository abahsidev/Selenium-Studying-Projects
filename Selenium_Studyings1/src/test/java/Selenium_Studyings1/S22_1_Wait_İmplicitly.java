package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S22_1_Wait_İmplicitly {@Test
public void Test() throws InterruptedException {
    String webdriver = "webdriver.chrome.drive";
    String driverlocation = ".idea/driver/chromedriver.exe";
    System.setProperty(webdriver, driverlocation);
    ChromeDriver driver = new ChromeDriver();
    String mainurl1 = "https://www.amazon.com";
    String mainurl2 = "https://the-internet.herokuapp.com";
    String mainurl3 = "https://selenium08.blogspot.com";
    String mainurl4 = "https://demoqa.com";
    String mainurl5="https://html.com/tags/iframe/";
    String parturl = "";
    //url git
    driver.get(mainurl1+parturl);

// it waits for definitly( Duration.ofSeconds)time if can't find but if finds it before definitly time it works
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
    searchbox.sendKeys("iphone", Keys.ENTER);



}
}
