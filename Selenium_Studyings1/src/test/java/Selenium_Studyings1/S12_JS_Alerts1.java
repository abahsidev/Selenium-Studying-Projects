package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_JS_Alerts1 {
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
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
      Thread.sleep(2000);
      // driver.switchTo().alert().accept();//kabul edeceksek
       driver.switchTo().alert().dismiss();// pas geçekesek kabul etmiş sayar ve yok olur
String actualresult=driver.findElement(By.xpath("//p[@id='result']")).getText();
  String expectedresult="successfully"  ;
if(actualresult.contains(expectedresult)){
    System.out.println("TEST  PASSED");

}
else{
    System.out.println("TEST FAILED");
}


      //  driver.quit();


}
}
