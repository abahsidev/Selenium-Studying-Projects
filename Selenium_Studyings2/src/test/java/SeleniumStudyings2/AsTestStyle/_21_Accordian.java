package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21_Accordian {
    WebDriver driver;

    @Test

    public void accordiantest() throws InterruptedException {

        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "accordian";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(500);
        WebElement collapseElement = driver.findElement(By.xpath("//div[@class='card'][2]/div[1]"));
        collapseElement.click();

        WebElement collapse2Element = driver.findElement(By.id("section2Content"));
        System.out.println(collapse2Element.getText());

        Thread.sleep(500);
        driver.quit();


    }


}
