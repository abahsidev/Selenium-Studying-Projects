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

public class Test5_RegisterUser_existing_email {
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
    public static void tearDown() {
        //    driver.quit();
    }

    @Test
    public void TEST5() {
        //1. Launch browser
        String url = "https://automationexercise.com";//https unutma

        //  2. Navigate to url 'http://automationexercise.com'
        driver.get(url);

        // 3. Verify that home page is visible successfully
        // method1
        System.out.println(driver.getCurrentUrl());
        //method2
        WebElement logoElement = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assertions.assertTrue(logoElement.isDisplayed());

        //4. Click on 'Signup / Login' button
        WebElement signElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        signElement.click();

        //5. Verify 'New User Signup!' is visible
        WebElement loginYazıElement = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assertions.assertTrue(loginYazıElement.isDisplayed());

        //6. Enter name and already registered email address
        WebElement emailElement = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        //we will write  an unavailable email address here
        emailElement.sendKeys("abba@baba.com");

        WebElement passwordElement = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        passwordElement.sendKeys("123456");

        // 7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        //  8. Verify error 'Your email or password is incorrect!'!' is visible
        String expected = "Your email or password is incorrect!";
        WebElement actual = driver.findElement(By.xpath("//p['Your email or password is incorrect!']"));
        // System.out.println(actual.getText());
        Assertions.assertEquals(expected, actual.getText());

        //  9. verify expected and actual urls the browser
        String expectedurl = "https://automationexercise.com/login";
        String actualurl = driver.getCurrentUrl();
        // System.out.println(actualurl);

        Assertions.assertEquals(expectedurl, actualurl);



    }

}
