package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _20_Modal_Small {
    WebDriver driver;

    @Test
    public void SmallModal() throws InterruptedException {

        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();

        String mainurl = "https://demoqa.com/";
        String parturl = "modal-dialogs";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
//clicking Small Modal Button
        WebElement smallModalElement = driver.findElement(By.id("showSmallModal"));
        smallModalElement.click();
        Thread.sleep(3000);

        WebElement text = driver.findElement(By.className("modal-body"));
        //getting Text on Small Modal
        System.out.println(text.getText());
        Thread.sleep(3000);
        //closing Small Modal

        WebElement closeSmallModaL = driver.findElement(By.cssSelector("button[id='closeSmallModal']"));
        closeSmallModaL.click();


//


    }


}

