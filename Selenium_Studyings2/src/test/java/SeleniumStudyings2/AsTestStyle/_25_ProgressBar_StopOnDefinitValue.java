package SeleniumStudyings2.AsTestStyle;

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

public class _25_ProgressBar_StopOnDefinitValue {
    WebDriver driver;

    @Test
    public void StopOnDefinitValueTest() throws InterruptedException {

        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "progress-bar";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
      Actions actions = new Actions(driver);
        //  we slide down the page twice to see "start button"
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();

//it starts the progress
        WebElement startButtonElement = driver.findElement(By.xpath("//button[text()='Start']"));
        //wait for 10 secs
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(startButtonElement));
        startButtonElement.click();

        WebElement progressbarElement = driver.findElement(By.xpath("//div[@role='progressbar']"));


        // check the progress percent each 1 . if you want to increase sensivity you should choose min INTEGER value
        wait.pollingEvery(Duration.ofMillis(1));

        //stop it on 55 percent


   wait.until(ExpectedConditions.attributeToBe(progressbarElement,"aria-valuenow","55"));
        WebElement stopButtonElement = driver.findElement(By.xpath("//button[text()='Stop']"));
        stopButtonElement.click();



    }

}
