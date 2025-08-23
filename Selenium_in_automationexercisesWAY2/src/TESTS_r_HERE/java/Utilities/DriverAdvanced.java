package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class DriverAdvanced {
    protected WebDriver driver;
    SoftAssert softAssert;

    // 1. Launch browser
    @BeforeClass
    public void setUp() {
        String browser = "edge";

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();///
                options.addArguments("--disable-popup-blocking");///
                driver = new ChromeDriver();
                break;

            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.operadriver().setup();
                driver = new EdgeDriver();

                break;

            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

        }


        //-------------------------------------------------------------------------

        softAssert = new SoftAssert();


        //-------------------------------------------------------------------------
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    //-------------------------------------------------------------------------
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
//          driver.quit();
        softAssert.assertAll();


    }


}


