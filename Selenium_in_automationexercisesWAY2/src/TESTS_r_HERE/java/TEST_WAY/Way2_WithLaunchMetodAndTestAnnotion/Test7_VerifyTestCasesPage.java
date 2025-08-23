package TEST_WAY.Way2_WithLaunchMetodAndTestAnnotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test7_VerifyTestCasesPage {
    //1. Launch browser
    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    //  10. close the browser
    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //  driver.quit();
    }
    @Test
    public void Test7() throws InterruptedException {
//2. Navigate to url 'http://automationexercise.com'
        String url = "https://automationexercise.com";// remember https alltime
        driver.get(url);
//3. Verify that home page is visible successfully
        WebElement homePageVisibility= driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[1]/div/a/img"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());

//4. Click on 'Test Cases' button
        driver.findElement(By.xpath("//*[text()=\"Test Cases\"]")).click();
//5. Verify user is navigated to test cases page successfully
String expectedURL="https://automationexercise.com/test_cases";
Assertions.assertEquals(expectedURL,driver.getCurrentUrl());

}}
