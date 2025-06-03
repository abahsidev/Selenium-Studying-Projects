package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _22_Autocomplete {


    WebDriver driver;

    @Test
    public void autocomplet_test() throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "auto-complete";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));


        WebElement msColorName = driver.findElement(By.id("autoCompleteSingleInput"));
        msColorName.sendKeys("Red"+ Keys.ENTER);//Colors with letter E should be seen in it
        //We will return to get the lists inside
      List<WebElement> suggestionElement = driver.findElements(By.cssSelector("div.auto-complete_option"));


        for (WebElement oneri : suggestionElement) {
            System.out.println(oneri.getText());
        }

    }


}
