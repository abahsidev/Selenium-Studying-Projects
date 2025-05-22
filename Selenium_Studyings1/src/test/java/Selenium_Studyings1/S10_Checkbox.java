package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class S10_Checkbox {
    WebDriver driver;
//clicking the checkboxes
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://the-internet.herokuapp.com";
        String parturl = "/checkboxes";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();

        List<WebElement> chbox=driver.findElements(By.xpath("(//input[@type='checkbox'])"));
        //ListWebElement chbox1=driver.findElement() clicking one  by one
        for (int i=0;i<chbox.size();i++){// clcicking loop style
            if(chbox.get(i).isSelected())// if checkbox is clicked
                continue;// it will pass it
            else {//if checkbox is not clicked
                chbox.get(i).click();//it will click it
            }

            Thread.sleep(2000);

        }

       // driver.close();




    }
}