package TESTS.PositiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Test_CheckNotifications extends _SignInTest {
//start test here with cursor

    @Test(priority = 2)
    public void CheckNotNotifications() {
//        By NotificationsNumber = By.cssSelector("*[contains(aria-label,'Notifications]");
//        System.out.println(NotificationsNumber);

        By NotificaitonLocator = By.xpath("//*[normalize-space()='Notifications']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(NotificaitonLocator)).click();

    }
}
