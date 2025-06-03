package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _20_Modal_Large {
    WebDriver driver;

    @Test
    public void LargeModal() throws InterruptedException {

        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "modal-dialogs";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
//clicking Large Modal Button
        WebElement LargeModalElement = driver.findElement(By.id("showLargeModal"));
        LargeModalElement.click();
        Thread.sleep(3000);

        WebElement text = driver.findElement(By.className("modal-body"));
        //getting Text on Large Modal
        System.out.println(text.getText());
        Thread.sleep(3000);
        //closing Large Modal

        WebElement closeLargeModaL = driver.findElement(By.id("closeLargeModal"));
        closeLargeModaL.click();


//


    }


}