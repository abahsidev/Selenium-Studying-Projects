package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_JS_Alerts3SendTextForAlertPrompt {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://the-internet.herokuapp.com";
        String parturl = "/javascript_alerts";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
        Thread.sleep(2000);
        String sendtexTx="atilla merhaba ";
driver.switchTo().alert().sendKeys(sendtexTx);

        driver.switchTo().alert().accept();//kabul et

        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@id='result']"));
        String actualresult= driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(actualresult);
        String expectedresult=sendtexTx  ;
        if(actualresult.contains(expectedresult)){
            System.out.println("TEST  PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }


        driver.quit();


    }













}
