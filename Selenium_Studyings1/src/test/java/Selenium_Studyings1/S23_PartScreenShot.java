package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class S23_PartScreenShot {
    @Test
    public void Test() throws InterruptedException, IOException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl1 = "https://www.amazon.com.tr";
        String mainurl2 = "https://the-internet.herokuapp.com";
        String mainurl3 = "https://selenium08.blogspot.com";
        String mainurl4 = "https://demoqa.com";
        String mainurl5 = "https://html.com/tags/iframe/";
        String parturl = "";


        //bekle
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//url git
        driver.get(mainurl1 + parturl);
        driver.manage().window().maximize();
        //iphone yaz ve ara
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("iphone", Keys.ENTER);
        //ARAMA SONUCUNUN EKRAN GÖRÜNTÜSÜNÜ ALALIM
        //BELLİ ALAN EKRAN GÖRÜNTÜSÜ 4 ADIMDA OLUŞTURULUR

        //Step1-Screenshot yapacağımız elemnti locate ederiz
        WebElement locateplace = driver.findElement(By.xpath("//h2[@class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]"));

        //Step2- KAydedeceğimiz dosyayı File oluştur.user.dir projemzin yolu

        File makedirectory = new File("SCREENSHOT");
        makedirectory.mkdir();

        String output = System.getProperty("user.dir") + "/SCREENSHOT/ekrangörüntüsüpartly.png";//ALTERNATİF1 KLASÖR YAPMA VE KAYDETME YERİ
        File sayfaTSS = new File(output);
        //File sayfaTSS = new File("C:/Users/USER/IdeaProjects/Selenium_in_Java_Emrah/target/ekrangörüntüsüpartly.png");ALTERNATİF2

        //Step3- bir dosya daha oluştur ve screenshot objesi ile ekran görüntüsü alma işlemi yapılcak
        File geçiciresim = locateplace.getScreenshotAs(OutputType.FILE);

        //Step4-Geçici resmi asıl kaydetmek istediğimiz sayfaya kopyalarız
        FileHandler.copy(geçiciresim, sayfaTSS);
      //  driver.close();


    }
}

