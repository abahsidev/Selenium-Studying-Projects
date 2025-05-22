package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S14_IFrametekrarBak {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://the-internet.herokuapp.com";
        String parturl = "/iframe";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@aria-label=\"Close\"]")).click();
        Thread.sleep(2000);

        String başlıktext = driver.findElement(By.xpath("//h3")).getText();
        System.out.println(başlıktext);
// IFRAME İÇİNE TEXT GÖNDERME
        //1 iframe locate et
        WebElement iframe = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframe);//DRİVER İFRAME İÇİNE GİRDİ

        WebElement sendtext = driver.findElement(By.tagName("p"));
        Thread.sleep(2000);
        sendtext.clear();//yazı varsa iinde siler önce

        Thread.sleep(2000);
        String text = "helllo world  again  ";
        Thread.sleep(2000);
        sendtext.sendKeys(text);
        //3 driveri iframeden çıkarma
        //3.1 bir üstdseviyede frame çıkartan
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        //3.2 bir EN üstdseviyede frame çıkartan
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.quit();

    }
}
