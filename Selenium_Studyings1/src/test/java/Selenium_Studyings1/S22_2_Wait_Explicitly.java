package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class S22_2_Wait_Explicitly {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl1 = "https://www.amazon.com";
        String mainurl2 = "https://the-internet.herokuapp.com";
        String mainurl3 = "https://selenium08.blogspot.com";
        String mainurl4 = "https://demoqa.com";
        String mainurl5 = "https://html.com/tags/iframe/";
        String parturl = "";
        //url git
        driver.get(mainurl1 + parturl);


        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("iphone");

        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));

        button.click();


    }
}
