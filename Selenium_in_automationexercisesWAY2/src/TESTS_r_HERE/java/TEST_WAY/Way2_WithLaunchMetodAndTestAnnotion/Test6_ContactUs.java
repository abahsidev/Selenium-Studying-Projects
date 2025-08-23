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
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
// a file as called sample.jpeg for line 69 should be existed for this test on Download File.
//But you can chooese anyone file on your computer
//But again  you must change path file and file name

public class Test6_ContactUs {
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
    public void Test6() throws InterruptedException {
//2. Navigate to url 'http://automationexercise.com'
        String url = "https://automationexercise.com";//https unutma
        driver.get(url);
//3. Verify that home page is visible successfully
        Thread.sleep(2000);
        WebElement homePageVisibility = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());
//4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[text()=' Contact us']")).click();
//5. Verify 'GET IN TOUCH' is visible
        WebElement GetInTouchVisibility = driver.findElement(By.xpath("//*[text()=\"Get In Touch\"]"));
        Assertions.assertTrue(GetInTouchVisibility.isDisplayed());
//6. Enter name, email, subject and message
        Actions actions = new Actions(driver);
        WebElement entertName = driver.findElement(By.name("name"));
        actions.click(entertName).
                sendKeys("ati").
                sendKeys(Keys.TAB).
                sendKeys("ab3@baba.com").
                sendKeys(Keys.TAB).
                sendKeys("Im writing this message . ........").
                sendKeys(Keys.TAB).
                sendKeys("the message was written.anything else ?").
                sendKeys(Keys.TAB).
                perform();

//7. Upload file

        WebElement upload = driver.findElement(By.name("upload_file"));

        //choose here filepath
        String chosenFilePath = "\\Downloads\\sampleFile.jpeg";
        String filaPath = System.getProperty("user.home") + chosenFilePath;

        //integrate the file with sendkeys
        upload.sendKeys(filaPath);

//8. Click 'Submit' button
        driver.findElement(By.cssSelector("input[value='Submit']")).click();

//9. Click OK button
        driver.switchTo().alert().accept();
//10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        String expectedMassage = "Success! Your details have been submitted successfully.";
        String actualMassage = driver.findElement(By.xpath("//*[text()='Success! Your details have been submitted successfully.']")).getText();

        Assertions.assertEquals(expectedMassage,actualMassage,"test failed0");
//11. Click 'Home' button and verify that landed to home page successfully
driver.findElement(By.xpath("//*[normalize-space()='Home']")).click();
    }

}
