package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S8_Locators__Practise_1 {

    WebDriver driver;

    @Test

    public void Practise1() {

        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://www.amazon.com.tr/";//goes to amazaon
        String parturl = "";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        WebElement cookieOK = driver.findElement(By.id("sp-cc-accept"));//accepts the cookies
        cookieOK.click();

        driver.findElement(By.name("field-keywords")).sendKeys("iphone 11", Keys.ENTER);//searches iphpne11
        WebElement firstprice=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        System.out.println(firstprice.getText());
        // we can 	assign to string driver.findelement...s
        String searchtext =
                driver.findElement(By.xpath("//div/h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[1]")).getText()
                +driver.findElement(By.xpath("//div/h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[3]")).getText();

        System.out.println(searchtext);//gets searched word
        if (searchtext.contains("iphone 11")) {// we compare  searched words
            System.out.println("TEST  PASSED");

        }
        else{
            System.out.println("TEST FAILED");
        }


    }
}
