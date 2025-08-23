package TEST_WAY.Way2_WithLaunchMetodAndTestAnnotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test2_Login_User_Correct_email {

    //1. Launch browser
    static WebDriver driver;

    @BeforeAll

    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //    driver.quit();
    }

    @Test
    public void TEST2() {
//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//3. Verify that home page is visible successfully
        WebElement homePageVisibility = driver.findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());
//4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        //5. Verify 'Login to your account' is visible

        WebElement loginAccounTex = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assertions.assertTrue(loginAccounTex.isDisplayed());
//6. Enter correct email address and password.It is a vaild address and password
        driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ab3@baba.com" + Keys.TAB);
        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("123456");

//7. Click 'login' button
        driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();

//8. Verify that 'Logged in as username' is visible


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement loggedAsLocator = driver.findElement(By.xpath("//*[@class='fa fa-user']"));
        Assertions.assertTrue(loggedAsLocator.isDisplayed());
//9. Click 'Delete Account' button
        driver.findElement(By.xpath(" //*[text()=' Delete Account']")).click();

//10. Verify that 'ACCOUNT DELETED!' is visible
        String expected = "ACCOUNT DELETED!";
        WebElement deletedLocator = driver.findElement(By.xpath("//*[text()='Account Deleted!']"));
        Assertions.assertEquals(expected, deletedLocator.getText());
    }
}


