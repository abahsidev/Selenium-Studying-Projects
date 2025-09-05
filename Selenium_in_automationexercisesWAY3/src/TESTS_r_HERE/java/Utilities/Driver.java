package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Driver {

    protected WebDriver driver;



    SoftAssert softAssert;


    @BeforeClass
    public void setUp() {

        //1. Launch browser


   WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        softAssert = new SoftAssert();

    }


    @AfterClass
    public void tearDown() {
      // driver.quit();
        softAssert.assertAll();
    }

}
