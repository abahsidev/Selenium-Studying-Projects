package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class S10_Radiobutton {

    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://demoqa.com";
        String parturl = "/radio-button";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        List<WebElement> RadibuttonTest= driver.findElements(By.xpath("(//label[@class=\"custom-control-label\"])"));
        Thread.sleep(3000);
        for(int i=0;i<RadibuttonTest.size();i++){
            RadibuttonTest.get(i).click();
            Thread.sleep(3000);
        }
        driver.navigate().refresh();


}}

