package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S21_Uploading {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl1 = "https://www.amazon.com";
        String mainurl2 = "https://the-internet.herokuapp.com";
        String mainurl3 = "https://selenium08.blogspot.com";
        String mainurl4 = "https://demoqa.com";
        String mainurl5 = "https://html.com/tags/iframe/";
        String parturl = "/upload";
        //url git
        driver.get(mainurl2 + parturl);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement upload = driver.findElement(By.id("file-upload"));

        //filepath will be chosen
        String chosenfilepath = "\\Downloads\\sampleFile.jpeg";
        String mainpath = System.getProperty("user.home") + chosenfilepath;
        //dosyasendkeys ile entegre edilcek
        upload.sendKeys(mainpath);
//upload edilcek
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);
//FİLE UPLOADED TEXTİNİ ALMA VE DOĞRULAMA
        String actual = driver.findElement(By.xpath("//h3[.='File Uploaded!']")).getText();
        String expected = "File Uploaded!";
        if (actual.equals(expected)) {
            System.out.println("TEST  PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }


    }
}


