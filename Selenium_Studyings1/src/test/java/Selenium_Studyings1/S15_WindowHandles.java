package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class S15_WindowHandles {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://the-internet.herokuapp.com";
        String parturl = "/windows";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Thread.sleep(2000);
        //liste ata array olarak
        List<String> tabS = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabS.size());
        //ilk sayfaya geri döner 2 sayfa bile olsa sayfaalr 0 dan başlar
        driver.switchTo().window(tabS.get(0));
        Thread.sleep(2000);
        //ikinci sayfaya geçer
        driver.switchTo().window(tabS.get(1));
        Thread.sleep(2000);
        //title alır
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        Thread.sleep(2000);
        //hangi sayfada aktif ise kapanır
        driver.close();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Elemental Selenium")).click();


        Thread.sleep(3000);
        driver.quit();

    }
}

