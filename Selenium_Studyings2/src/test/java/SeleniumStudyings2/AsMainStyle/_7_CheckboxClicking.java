package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _7_CheckboxClicking {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/automation-practice-form";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //we will click  a "gender " value .your choice
        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        gender.click();

        Thread.sleep(2000);// "Thread.sleep(2000) command allows full to wait in 2000 milliseconds
        List<WebElement> hobbiesElement = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));

        //  we will click all hobby values in order
        for (int i = 0; i <= hobbiesElement.size(); i++) {
            hobbiesElement.get(i).click();
        //if hobby checkbox is empty,return true
            Boolean isSelected = hobbiesElement.isEmpty();
            System.out.println(isSelected);

            Thread.sleep(3000);
            //    driver.quit();
        }


    }
}
