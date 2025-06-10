package TESTS.PositiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
//start test here with cursor
public class Test_CheckMyNetwork extends _SignInTest {
    @Test(priority=2)
    public void CheckMyNetwork() throws InterruptedException {
        // we pass to My Network page in LinkedIn

        By MyNetworkLocator = By.xpath("//*[normalize-space()='My Network']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MyNetworkLocator)).click();
        Thread.sleep(2000);

        //it returns to back page
        driver.navigate().back();

    }
}
