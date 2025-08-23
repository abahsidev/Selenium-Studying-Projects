package TEST_WAY.Way2_WithLaunchMetodAndTestAnnotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Test10_Verify_Subscription_inHomePage {
    protected WebDriver driver;
    SoftAssert softAssert;
    Actions actions;

    @BeforeClass
    //1. Launch browser
    public void setUp() {

        WebDriverManager.operadriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        softAssert = new SoftAssert();
        actions = new Actions(driver);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void TEST10() throws InterruptedException {

//2. Navigate to url 'http://automationexercise.com'
        String url = "https://automationexercise.com";// remember https alltime
        driver.get(url);
//3. Verify that home page is visible successfully
        WebElement homePageVisibility = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());
//4. Scroll down to footer

        actions.sendKeys(Keys.END).perform();
//5. Verify text 'SUBSCRIPTION'
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()='Subscription']")).isEnabled());
//6. Enter email address in input and click arrow button
        Thread.sleep(2000);
        actions.sendKeys(driver.findElement(By.id("susbscribe_email"))).click().
                sendKeys("ab3@baba.com").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();
//7. Verify success message 'You have been successfully subscribed!' is visible

        softAssert.assertTrue(driver.findElement(By.xpath("//*[@id=\"success-subscribe\"]/div")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"success-subscribe\"]/div")).getText());


    }
}
