package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S13_Basic_Authentication {
    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://the-internet.herokuapp.com";
        String parturl = "/basic_auth";
        //aşağıdakşi komutta ancak username ve passwoed soran yere ulaşabkşrsşn
        //driver.get(mainurl + parturl);
        //aşapıdaki html develancak o zaman girbilirsin
        //html kodu:https://username:password@url
        String html="https://admin:admin@the-internet.herokuapp.com";
        driver.get(html+parturl);



        driver.manage().window().maximize();
        Thread.sleep(5000);
        String text= driver.findElement(By.xpath("//p")).getText();
        System.out.println(text);
if(text.contains("Congratulations")){

    System.out.println("test passed");
}




     // driver.quit();
    }}
