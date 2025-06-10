package TESTS.LinkedInTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_MakePublishDemo {

    public static void main(String[] args) {
        String webdriver = "webdriver.chrome.drive";
        String Computerlocation = System.getProperty("user.home");
        String driverpath = "IdeaProjects\\Selenium_in_automationexercises\\src\\driver";

        System.setProperty(webdriver, Computerlocation + driverpath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://linkedin.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[normalize-space()='E-posta ile oturum açın']")).click();


        WebElement ePost = driver.findElement(By.id("username"));
        ePost.click();
        ePost.sendKeys("xxx");
        WebElement ePostPassword = driver.findElement(By.id("password"));
        ePostPassword.click();
        ePostPassword.sendKeys("xxxx");
        driver.findElement(By.xpath("//*[normalize-space()='Oturum aç']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String message = "THIS ARTICLE WAS SENT BY SELENIUM  TEST.THIS CONTAINS SELENIUM CODES.\n" +
                "ENJOY!\n" +
                "public class lnkedin {\n" +
                "    public static void main(String[] args) {\n" +
                "        String webdriver = \"webdriver.chrome.drive\";\n" +
                "        String Computerlocation = System.getProperty(\"user.home\");\n" +
                "        String driverpath = \"IdeaProjects\\\\Selenium_in_automationexercises\\\\src\\\\driver\";\n" +
                "\n" +
                "        System.setProperty(webdriver, Computerlocation + driverpath);\n" +
                "        WebDriver driver = new ChromeDriver();\n" +
                "        driver.get(\"https://linkedin.com\");\n" +
                "        driver.manage().window().maximize();\n" +
                "        driver.findElement(By.xpath(\"//*[normalize-space()='E-posta ile oturum açın']\")).click();\n" +
                "\n" +
                "\n" +
                "        WebElement ePost = driver.findElement(By.id(\"username\"));\n" +
                "        ePost.click();\n" +
                "        ePost.sendKeys(\"xxxxxxxxxxx\");\n" +
                "        WebElement ePostPassword = driver.findElement(By.id(\"password\"));\n" +
                "        ePostPassword.click();\n" +
                "        ePostPassword.sendKeys(\"xxxxxxxx\");\n" +
                "        driver.findElement(By.xpath(\"//*[normalize-space()='Oturum aç']\")).click();\n" +
                "        String message = \"This article was sent using the Selenium test.\" ;\n" +
                "\n" +
                "        ;\n" +
                "        driver.findElement(By.xpath(\"(//*[normalize-space()='Start a post'])[2]\")).click();\n" +
                "        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));\n" +
                "\n" +
                "\n" +
                "        WebElement sndText driver.findElement(By.xpath(//*[contains(@id,’emb’)]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/p\n" +
                "\"));\n" +
                "        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));\n" +
                "        sndText.sendKeys(message);\n" +
                "  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));\n" +
                "        driver.findElement(By.xpath(\"//span[normalize-space()='Post']\")).click();\n" +
                "\n" +
                "    }}\n";


        driver.findElement(By.xpath("(//*[normalize-space()='Start a post'])[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));


        WebElement sndText = driver.findElement(By.xpath("//*[contains(@id,'embe')]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/p"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        sndText.sendKeys(message);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.findElement(By.xpath("//span[normalize-space()='Post']")).click();


    }


}
