package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4_WebDriverNavigate { ;

    WebDriver driver;
    @Test
    public void navigateTest() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://www.mynet.com/";
        String parturl = "https://www.youtube.com/";
        //goes to mynet
        driver.navigate().to(mainurl);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);//wait for 1000 miliseconds
        //goes to youtube
        driver.navigate().to(parturl);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);//wait for 2000 miliseconds
        //goes back to mynet
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        // //goes back to youtube again
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        //refresh the currently page
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

    }

}
