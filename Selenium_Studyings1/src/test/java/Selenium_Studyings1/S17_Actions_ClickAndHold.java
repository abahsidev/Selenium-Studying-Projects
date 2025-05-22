package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S17_Actions_ClickAndHold {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        ChromeDriver driver = new ChromeDriver();
        String mainurl1 = "https://www.amazon.com";
    String mainurl2="https://the-internet.herokuapp.com";
    String mainurl3="https://selenium08.blogspot.com";
    String parturl = "/2020/01/click-and-hold.html";
        driver.get(mainurl3 + parturl);
        driver.manage().window().maximize();
    WebElement letterC=driver.findElement(By.xpath("//li[@name=\"C\"]"));
    WebElement letterK=driver.findElement(By.xpath("//li[@name=\"K\"]"));
    Actions actions=new Actions(driver);
    actions.clickAndHold(letterC).moveToElement(letterK).perform();



}}
