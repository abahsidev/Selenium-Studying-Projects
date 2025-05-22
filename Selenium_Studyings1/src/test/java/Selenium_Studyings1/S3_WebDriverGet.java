package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S3_WebDriverGet {
    WebDriver driver;
    @Test
    public void getTest(){
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://www.mynet.com/";
        String parturl = "";
        driver.get(mainurl + parturl);
        System.out.println(driver.getCurrentUrl());



        System.out.println(driver.getTitle());//title of page
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getClass());//it gives browser's currently class
        String actualtitle= driver.getTitle();
        String expectedtitle="Mynet";
        if (actualtitle.contains(expectedtitle)){
            System.out.println("TEST  PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }




    }




}
