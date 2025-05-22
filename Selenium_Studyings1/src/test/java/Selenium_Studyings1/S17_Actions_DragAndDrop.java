package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S17_Actions_DragAndDrop {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl1 = "https://www.amazon.com";
        String mainurl2 = "https://the-internet.herokuapp.com";
        String mainurl3 = "https://selenium08.blogspot.com";
        String mainurl4 = "https://demoqa.com";

        String parturl = "/droppable";
        driver.get(mainurl4 + parturl);
        driver.manage().window().maximize();
        WebElement dragX = driver.findElement(By.id("draggable"));
        WebElement dropX = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragX, dropX).perform();
        String expected = "Dropped";
        String actual = dropX.getText();
        System.out.println(dropX.getText());
        if(actual.contains(expected)){
            System.out.println("TEST  PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }
   //     driver.quit();


    }
}
