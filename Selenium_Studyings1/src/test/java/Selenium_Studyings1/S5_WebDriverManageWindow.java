package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5_WebDriverManageWindow {
    WebDriver driver;
    @Test
    public void WindowTest() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        driver= new ChromeDriver();
        String mainurl = "https://www.mynet.com/";
        String parturl = "";
        driver.get(mainurl + parturl);
        System.out.println(  driver.manage().window().getPosition());
        System.out.println(  driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(100, 1000));
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,1000));
        Thread.sleep(3000);

        driver.manage().window().minimize();
        Thread.sleep(3000);

        driver.manage().window().setSize(new Dimension(1000, 100));
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(800,100));
        Thread.sleep(3000);

        driver.manage().window().setSize(new Dimension(500, 500));
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        System.out.println( "maksimum"+ driver.manage().window().getPosition());
        System.out.println("maksimum"+  driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        System.out.println( "fullscreen"+
                driver.manage().window().getPosition());
        System.out.println("fullscreen"+  driver.manage().window().getSize());
        Thread.sleep(3000);
        driver.close();

}}
