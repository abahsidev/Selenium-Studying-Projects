package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S19_Iframe_Practice2 {
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
        driver.get(mainurl5);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        //  until seeing the video, the page should be pressed twice to  bring down
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).

                perform();
        //to watch video
        // firstly, find iframe locator
        WebElement iframe = driver.findElement(By.xpath("//iframe[1]"));
        driver.switchTo().frame(iframe);//here Driver is inside IFRAME

        WebElement play = driver.findElement(By.xpath("//button[@aria-label=\"Oynat\"] "));
        play.click();
//click to pause
        WebElement pause = driver.findElement(By.xpath("//button[@aria-label=\"Duraklat klavye kısayolu k\"] "));
        Thread.sleep(25000);

        pause.click();
        //  driver.quit();


    }
}
