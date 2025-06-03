package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _26_Tooltips {
    WebDriver driver;

    @Test
    public void tooltips() throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);

        String mainurl = "https://demoqa.com/";
        String parturl = "tool-tips";
        driver = new ChromeDriver();
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        //locate it
        WebElement toolTipElement = driver.findElement(By.id("toolTipButton"));
//move to tooltip and stop on it
        Actions action = new Actions(driver);
        action.moveToElement(toolTipElement).perform();

        //wait 15 secs

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // wait for  related classname until being located
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));

// get text
        WebElement text = driver.findElement(By.className("tooltip-inner"));
        System.out.println(text.getText());


    }

}
