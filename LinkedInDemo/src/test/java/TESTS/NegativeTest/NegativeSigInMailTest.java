package TESTS.NegativeTest;

import Utilities.DriverAdvanced;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class NegativeSigInMailTest extends DriverAdvanced {
SoftAssert softAssert;
//start test here with cursor
    //that is a negative test .
    // This test purpose is  we can online in linkedIn with a fake email or a passwords or not?

    @Test(priority=1)
    public void InValidLogIn(){
        driver.get("https://linkedin.com");
        driver.findElement(By.xpath("//*[normalize-space()='E-posta ile oturum açın']")).click();


        WebElement ePost = driver.findElement(By.id("username"));
        ePost.click();
        ePost.sendKeys("istanbul@abcdefg.com");//you can write an invalid email
        WebElement ePostPassword = driver.findElement(By.id("password"));
        ePostPassword.click();
        ePostPassword.sendKeys("pardon_me");//you can write an invalid  password
        driver.findElement(By.xpath("//*[normalize-space()='Oturumum açık kalsın']")).click();
        driver.findElement(By.xpath("//*[normalize-space()='Oturum aç']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Assertions.assertTrue(driver.findElement(By.xpath("(//div[@id='error-for-password'])")).isDisplayed());


    }

}

