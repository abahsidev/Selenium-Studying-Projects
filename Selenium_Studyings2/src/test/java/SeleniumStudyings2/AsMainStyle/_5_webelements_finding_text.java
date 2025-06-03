package SeleniumStudyings2.AsMainStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _5_webelements_finding_text {
    WebDriver driver;

    @Test
    public void gettext() throws InterruptedException {


        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);
        WebDriver driver = new ChromeDriver();


        String mainurl1 = "https://www.amazon.com";
        String mainurl2 = "https://the-internet.herokuapp.com";
        String mainurl3 = "https://selenium08.blogspot.com";
        String mainurl4 = "https://demoqa.com";
        String mainurl5 = "https://html.com/tags/iframe/";
        String parturl = "/text-box";

        driver.get(mainurl4 + parturl);
        //--------------------------------------------------------
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //--------------------------------------------------------

        Thread.sleep(1500);
        WebElement NameElement = driver.findElement(By.xpath("//input[@id='userName']"));
        NameElement.click();
        NameElement.sendKeys("atikus");

        Thread.sleep(2000);
        WebElement mailnameElement = driver.findElement(By.xpath("//input[@type='email']"));
        mailnameElement.click();
        mailnameElement.sendKeys("baba@makara.com");

        Thread.sleep(2000);
        WebElement Currentaddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        Currentaddress.click();
        Currentaddress.sendKeys("istanbul");

        WebElement Permanentaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        Permanentaddress.click();
        Permanentaddress.sendKeys("istanbul");

        Thread.sleep(2000);
        WebElement submitElement = driver.findElement(By.xpath("//button[@id='submit']"));
        submitElement.click();


        //get.text():to get text command we coded to get name text
        WebElement getTextElement = driver.findElement(By.xpath("//p[@id='name']"));
        System.out.println(getTextElement.getText());


    }

}
