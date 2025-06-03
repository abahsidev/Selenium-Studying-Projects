package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8_Radiobutton {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);
        WebDriver driver = new ChromeDriver();

        String url="https://demoqa.com/radio-button";
        driver.get(url);
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        WebElement options= driver.findElement(By.cssSelector("[for=yesRadio]"));
        options.click();
        Thread.sleep(3000);
        WebElement options2= driver.findElement(By.cssSelector("[for=impressiveRadio]"));
        options2.click();

        Thread.sleep(3000);
        driver.quit();




    }



}
