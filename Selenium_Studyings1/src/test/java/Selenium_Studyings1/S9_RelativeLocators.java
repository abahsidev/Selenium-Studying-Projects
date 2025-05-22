package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class S9_RelativeLocators {
    WebDriver driver;

    @Test

    public void Test(){
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://www.shutterstock.com/tr/search/web-sitesi";
        String parturl = "";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        WebElement resim1=driver.findElement(By.xpath("(//a[@class='mui-t7xql4-a-inherit-link'])[1]"));
        WebElement resim3=driver.findElement(By.xpath("(//a[@class='mui-t7xql4-a-inherit-link'])[3]]"));
WebElement resim2=driver.findElement(RelativeLocator.with(By.xpath("(//a[@class='mui-t7xql4-a-inherit-link'])[2]")).toLeftOf(resim3));
WebElement resim2_1=driver.findElement(RelativeLocator.with(By.xpath("(//a[@class='mui-t7xql4-a-inherit-link'])[2]")).toRightOf(resim1));
if (resim2_1==resim2){
    System.out.println("TEST  PASSED");

}
else{
    System.out.println("TEST FAILED");
}
}}
