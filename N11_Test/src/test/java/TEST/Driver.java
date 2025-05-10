package TEST;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Driver {
WebDriver driver;




SoftAssert softAssert;

    @BeforeClass

    public  void setUp() {
        switch (browser):{
            case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }

        softAssert=new SoftAssert();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public  void tearDown() {
       //  driver.quit();
         softAssert.assertAll();

    }
}
