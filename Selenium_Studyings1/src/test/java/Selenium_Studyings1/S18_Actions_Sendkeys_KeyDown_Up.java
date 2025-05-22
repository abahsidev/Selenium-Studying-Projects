package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S18_Actions_Sendkeys_KeyDown_Up { @Test
public void Test() throws InterruptedException {
    String webdriver = "webdriver.chrome.drive";
    String driverlocation = ".idea/driver/chromedriver.exe";
    System.setProperty(webdriver, driverlocation);
    ChromeDriver driver = new ChromeDriver();
    String mainurl1 = "https://www.amazon.com";
    String mainurl2 = "https://the-internet.herokuapp.com";
    String mainurl3 = "https://selenium08.blogspot.com";
    String mainurl4 = "https://demoqa.com";
    String parturl = "";
    driver.get(mainurl1 + parturl);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));

    Actions actions = new Actions(driver);
    actions.click(searchbox).
         keyDown(Keys.SHIFT).//shifte bas
            sendKeys("s").//küçük s yazdır ki bu onu büyük hale getirir
            keyUp(Keys.SHIFT).//shiftten elini çek
            sendKeys("amsung").//amsung yazdır
            sendKeys(Keys.SPACE).//space bastırt ve bir boşluk olsun
            keyDown(Keys.SHIFT).
            sendKeys("a").//A  Yazdırt
            keyUp(Keys.SHIFT).
            sendKeys("71").  //71  Yazdırt
            sendKeys(Keys.ENTER).//entera bastırt
            perform();//işlemi aktive et
WebElement text= driver.findElement(By.xpath("//*[@class=\"a-color-state a-text-bold\"]"));
//
String Actual=text.getText();
String expected="Samsung A71";
if (Actual.contains(expected)){
    System.out.println("TEST  PASSED");
}
else{
    System.out.println("TEST FAILED");
}




}}
