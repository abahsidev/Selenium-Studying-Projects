package SeleniumStudyings2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePathFindingOnComputer {
    WebDriver driver;

    @Test
    public void Test() {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";


        String webdriver = "webdriver.chrome.driver";


        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
    }
}
