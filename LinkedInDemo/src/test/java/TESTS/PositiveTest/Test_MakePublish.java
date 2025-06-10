package TESTS.PositiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_MakePublish extends _SignInTest {
//start test here with cursor

    @Test(priority = 2)
    public void MakeComment() {
        //what will write in message?whatever you want.first I copied this whole class and pasted on a word class a
        //afterwords I copied it and pasted into message
        //And this class was published as a comment in my LinkedIn Account

        String message = "";


        driver.findElement(By.xpath("(//*[normalize-space()='Start a post'])[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));


        WebElement sndText = driver.findElement(By.xpath("//*[contains(@id,'embe')]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/p"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        sndText.sendKeys(message);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.findElement(By.xpath("//span[normalize-space()='Post']")).click();


    }


}
