package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class DriverAdvanced {
    protected WebDriver driver;
    SoftAssert softAssert;
    Actions actions;

    // 1. Launch browser
    @BeforeClass
    public void setUp() {
        String browser = "chrome";

        switch ("browser") {
            case "chrome":
                //    System.setProperty("webdriver.chromedriver","you will write driver path here ");method2 for driver path
                WebDriverManager.chromedriver().setup();
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

            case "explorer":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();

                break;

            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;


        }


        String mainurl = "https://linkedin.com";// remember https://  alltime
        String parturl = "";// remember https://  alltime
        driver.get(mainurl);
        driver.get(mainurl.concat(parturl));//it combines two parts.it equals ==> driver.get(mainurl+parturl)
        //-------------------------------------------------------------------------
        actions = new Actions(driver);
        softAssert = new SoftAssert();


        //-------------------------------------------------------------------------
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    //-------------------------------------------------------------------------
    @AfterClass
    public void tearDown() {
     //   driver.quit();
        softAssert.assertAll();


    }


}


