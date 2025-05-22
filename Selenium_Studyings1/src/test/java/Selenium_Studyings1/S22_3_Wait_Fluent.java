package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class S22_3_Wait_Fluent {
    static int count=1;
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
        //go to url
        driver.get(mainurl1 + parturl);


        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("iphone");



        //  Syntax is like below


        Wait<WebDriver> waiT=new FluentWait<WebDriver>(driver).
                withTimeout(Duration.ofSeconds(30)).//wait for total 30 secs
                pollingEvery(Duration.ofSeconds(5)).//search per 5secs
                ignoring(Exception.class);//ignore exceptions everywhere
        WebElement button=waiT.until(S22_3_Wait_Fluent :: apply);
        button.click();



        //aşağısı id taramsı zorunlu


    }

    private static WebElement apply(WebDriver webDriveR) {
        System.out.println(count +" .deneme");
        count++;
        return webDriveR.findElement(By.id("nav-search-submit-button"));
    }
}
