package TEST_WAY.Way2_WithLaunchMetodAndTestAnnotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test4_LogoutUser {
    //1. Launch browser

    static WebDriver driver;

    @BeforeAll

    public static void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //   driver.quit();
    }

    @Test
    public void TEST4() throws InterruptedException {


//2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");
//3. Verify that home page is visible successfully
        Thread.sleep(2000);
        WebElement homePageVisibility = driver.findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());

//4. Click on 'Signup / Login' button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()=\" Signup / Login\"]")).click();
//5. Verify 'Login to your account' is visible
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement loggedAsLocator = driver.findElement(By.xpath("//*[text()=\"Login to your account\"]"));
        Assertions.assertTrue(loggedAsLocator.isDisplayed());
//6. Enter correct email address and password
        driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ab3@baba.com" + Keys.TAB);
        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("123456");
//7. Click 'login' button
        driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();
//8. Verify that 'Logged in as username' is visible
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement a = driver.findElement(By.xpath("//*[@class='fa fa-user']"));
        Assertions.assertTrue(a.isDisplayed());
//9. Click 'Logout' button
        driver.findElement(By.xpath("//*[@href=\"/logout\"]")).click();
//10. Verify that user is navigated to login page
        WebElement loginPageLocator = driver.findElement(By.xpath("//*[text()=\"Login to your account\"]"));
        Assertions.assertTrue(loginPageLocator.isDisplayed());


    }
}
