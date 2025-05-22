package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_Locators__Practise_2 {
    WebDriver driver;

    @Test
    public void Practise2() {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://www.amazon.com.tr/";
        String parturl = "";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        WebElement cookieOK = driver.findElement(By.id("sp-cc-accept"));
        cookieOK.click();

        driver.findElement(By.name("field-keywords")).sendKeys("laptop", Keys.ENTER);


        System.out.println(driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']/span)[1]")).getText());

        WebElement firstprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));

        System.out.println(firstprice.getText());
        WebElement sonuc = driver.findElement(By.xpath("(//div/h2[@class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]/span)[1]"));

        System.out.println(sonuc.getText());
        driver.close();


    }

}
