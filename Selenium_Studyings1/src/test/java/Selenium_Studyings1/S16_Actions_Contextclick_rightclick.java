package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S16_Actions_Contextclick_rightclick {

    @Test
public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
    ChromeDriver driver = new ChromeDriver();
    String mainurl1 = "https://www.amazon.com";
    String mainurl2="https://the-internet.herokuapp.com";
    String parturl = "/context_menu";
    driver.get(mainurl2 + parturl);
    driver.manage().window().maximize();
    ////p[.="Context menu items are custom additions that appear in the right-click menu."]
        System.out.println(driver.getTitle());
        Actions actions=new Actions(driver);
        WebElement square_click= driver.findElement(By.id("hot-spot"));
        actions.contextClick(square_click).perform();//makes right.click
        String actualresult= driver.switchTo().alert().getText();//gets the text
        System.out.println(actualresult);
        String expectedresult="You selected a context menu"  ;
        if(actualresult.contains(expectedresult)){
            System.out.println("TEST  PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }

        driver.switchTo().alert().accept();
      //  driver.quit();







}}
