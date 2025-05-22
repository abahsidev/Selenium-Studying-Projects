package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class S21_FileDownload {@Test
public void Test() throws InterruptedException {
    String webdriver = "webdriver.chrome.drive";
    String driverlocation = ".idea/driver/chromedriver.exe";
    System.setProperty(webdriver, driverlocation);
    ChromeDriver driver = new ChromeDriver();
    String mainurl1 = "https://www.amazon.com";
    String mainurl2 = "https://the-internet.herokuapp.com";
    String mainurl3 = "https://selenium08.blogspot.com";
    String mainurl4 = "https://demoqa.com";
    String mainurl5="https://html.com/tags/iframe/";
    String parturl = "/download";
    //url git
    driver.get(mainurl2+parturl);
    driver.manage().window().maximize();
    Thread.sleep(2000);
   // WebElement download = driver.findElement(By.xpath("//a[8]"));// //a[.='excelParaValidar.xlsx']yazıyı alır
    WebElement download = driver.findElement(By.xpath("//a[.='random_data.txt']"));// //a[.='excelParaValidar.xlsx']yazıyı alır
    download.click();
    Thread.sleep(3000);

    String indirilenler="\\Downloads\\random_data.txt";
    String dosyayolu= System.getProperty("user.home")+indirilenler;
    Boolean expect= Files.exists(Paths.get(dosyayolu));
if(expect){
    System.out.println("TEST  PASSED");
}
else{
    System.out.println("TEST FAILED");
}


    driver.quit();
}}

