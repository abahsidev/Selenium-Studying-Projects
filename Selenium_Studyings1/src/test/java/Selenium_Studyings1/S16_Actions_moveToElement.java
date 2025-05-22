package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S16_Actions_moveToElement {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://www.amazon.com";
        String parturl = "";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();

        //stands still on "hello" TEXT

        WebElement hellotext = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hellotext).perform();
        Thread.sleep(3000);
        //clicking  "create a list"
       actions.click(driver.findElement(By.xpath("//span[.='Create a List']"))).perform();
       //gets current link and verifying
String actual= driver.getCurrentUrl();
String expected="https://www.amazon.com/hz/wishlist/intro";

if(actual.equals(expected)){
    System.out.println("test passed");
}else{
    System.out.println("failed");
}


    }
}
