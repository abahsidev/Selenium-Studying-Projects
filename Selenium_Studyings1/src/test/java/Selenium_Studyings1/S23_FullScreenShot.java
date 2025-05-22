package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class S23_FullScreenShot {
    @Test
    public void Test() throws InterruptedException, IOException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl1 = "https://www.amazon.com.tr";
        String mainurl2 = "https://the-internet.herokuapp.com";
        String mainurl3 = "https://selenium08.blogspot.com";
        String mainurl4 = "https://demoqa.com";
        String mainurl5 = "https://html.com/tags/iframe/";
        String parturl = "";


        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//go to url
        driver.get(mainurl1 + parturl);
        driver.manage().window().maximize();
        //write iphone and search
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("iphone", Keys.ENTER);

        //full screen shot is created in five steps

        //Step1- create TakeScreenshoT object
        TakesScreenshot TSS = (TakesScreenshot) driver;

        //Step2- create a file to save.
        File fullPageTSS = new File("C:/Users/USER/Desktop/ScreenShot.png");

        //Step3- create one more file and   screenshot objesi ile ekran görüntüsü alma işlemi yapılcak
        File tempPicture = TSS.getScreenshotAs(OutputType.FILE);

        //Step4-Geçici resmi asıl kaydetmek istediğimiz sayfaya kopyalarız
        FileHandler.copy(tempPicture, fullPageTSS);


       // driver.close();

    }
}

