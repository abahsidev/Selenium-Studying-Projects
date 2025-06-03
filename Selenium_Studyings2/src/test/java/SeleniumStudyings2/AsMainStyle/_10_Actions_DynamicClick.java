package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_Actions_DynamicClick {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);
        System.setProperty("webdriver.chrome.driver", driverlocation);
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/buttons";
        driver.get(url);
        Thread.sleep(3000);
        driver.manage().window().maximize();


        WebElement clickMeElement = driver.findElement(By.xpath("    //div/button[text()='Click Me'] "));
        clickMeElement.click();
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());


    }
}
