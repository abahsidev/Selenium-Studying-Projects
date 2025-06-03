package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _25_ProgressBar_Reset100Percent {
    WebDriver driver;
    Actions actions;

    @Test
    public void Reset100PercentTest() throws InterruptedException {

        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "progress-bar";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        actions = new Actions(driver);
       //  we slide down the page twice to see "start button"
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//it starts the progress here
        WebElement startButtonElement = driver.findElement(By.id("startStopButton"));
        //it waits until start button clickable
        wait.until(ExpectedConditions.elementToBeClickable(startButtonElement));
        //and it clicks to the start button here
        startButtonElement.click();
        //we locate the reset button element here
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement resetElement = driver.findElement(By.xpath("//*[normalize-space()=\"Reset\"]"));

        //we wait  reset element until clickable
        wait.until(ExpectedConditions.elementToBeClickable(resetElement));Thread.sleep(3000);
        //we click reset  button
        resetElement.click();


        // wait.until(ExpectedConditions.elementToBeClickable(resetElement)).click();

        //   Assertions.assertTrue(resetElement.isDisplayed());


    }

}
