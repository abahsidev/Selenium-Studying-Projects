package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class _12_Links {
    public static void main(String[] args) {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);
        //////////////    //////////////
        String webdriver = "webdriver.chrome.driver";

        //////////////    //////////////
        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/links";
        driver.get(url);

        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Moved")).click();
        driver.findElement(By.linkText("Bad Request")).click();

        WebElement MovedResponseText = driver.findElement(By.id("linkResponse"));
        System.out.println(MovedResponseText.getText());

        WebElement BadResponseText = driver.findElement(By.id("linkResponse"));
        System.out.println(BadResponseText.getText());
    }
}
