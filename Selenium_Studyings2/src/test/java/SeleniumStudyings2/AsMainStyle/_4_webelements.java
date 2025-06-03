package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.Scanner;

public class _4_webelements {
    private static Sleeper Thread;

    public static void main(String[] args) throws InterruptedException {
        //navigating the driver

        String webdriver = "webdriver.chrome.drive";
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";

        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();

        //entering url manually
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the url : ");
        String url = scanner.nextLine();
        /* url >>>>
             https://demoqa.com/text-box
                <<<<<<<copy and  paste that url  on it when  ask for you
         */

        driver.get(url);
        driver.manage().window().maximize();


        WebElement NameElement = driver.findElement(By.xpath("//input[@id='userName']"));// locating relevant element
        NameElement.click();//clicking element
        NameElement.sendKeys("atikus");//entering value

        WebElement mailnameElement = driver.findElement(By.xpath("//input[@type='email']"));// locating relevant element
        mailnameElement.click();//clicking element
        mailnameElement.sendKeys("baba@makara.com");//entering value

        WebElement Currentaddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));/// locating relevant element
        Currentaddress.click();//clicking element
        Currentaddress.sendKeys("istanbul");//entering value

        WebElement Permanentaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));//like abovesame
        Permanentaddress.click();//clicking element
        Permanentaddress.sendKeys("istanbul");//entering value


        WebElement submitElement = driver.findElement(By.xpath("//button[@id='submit']"));//submit locating
        submitElement.click();//submit clicking


    }

}
