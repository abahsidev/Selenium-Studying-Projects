package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class S24_JavaScript_Executor1 { @Test
public void Test() throws InterruptedException, IOException {
    String webdriver = "webdriver.chrome.drive";
    String driverlocation = ".idea/driver/chromedriver.exe";
    System.setProperty(webdriver, driverlocation);
    ChromeDriver driver = new ChromeDriver();
    String mainurl1 = "https://www.amazon.com";
    String mainurl2 = "https://the-internet.herokuapp.com";
    String mainurl3 = "https://selenium08.blogspot.com";
    String mainurl4 = "https://demoqa.com";
    String mainurl5 = "https://html.com/tags/iframe/";
    String parturl = "";


 //url git
    driver.get(mainurl1 + parturl);
    driver.manage().window().maximize();

//3 adımda hareket edilir

    //adım1 JSExecutor drive cast edeceğiz
    JavascriptExecutor jse=(JavascriptExecutor) driver;

    //adım2 ilgili webelement locate et
    WebElement sell= driver.findElement(By.xpath("//*[.='Sell products on Amazon']"));
    //adım3 jse.executorScript(ilgiliscript;ilgili webelement)
    jse.executeScript("arguments[0].click;",sell);

    WebElement controlelement= driver.findElement(By.xpath("//*[contains(text(),'$50,000 in branded sales')]"));
if(controlelement.isEnabled()){
    System.out.println("test passed");
}
else{
    System.out.println("test failed");
    driver.quit();
}




}}

