package TESTS.PositiveTest;

import Utilities.DriverAdvanced;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class _SignInTest extends DriverAdvanced {
//start test here with cursor

    @Test(priority = 1)
    public void SignIn() {

        driver.findElement(By.xpath("//*[normalize-space()='E-posta ile oturum açın']")).click();
//------------------------------------------------------------------

        WebElement ePost = driver.findElement(By.id("username"));
        ePost.click();
        ePost.sendKeys("xxxx");//write here your valid password instead of xxxxxx
//------------------------------------------------------------------

        WebElement ePostPassword = driver.findElement(By.id("password"));
        ePostPassword.click();
        ePostPassword.sendKeys("xxxxxx"); //write here your valid password instead of xxxxxx
//------------------------------------------------------------------

        driver.findElement(By.xpath("//*[normalize-space()='Oturumum açık kalsın']")).click();
        driver.findElement(By.xpath("//*[normalize-space()='Oturum aç']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// write your account name instead of xxxxxx
        Assertions.assertTrue(driver.findElement(By.xpath("//*[text()='xxxxxxx']")).isDisplayed());

    }

}
