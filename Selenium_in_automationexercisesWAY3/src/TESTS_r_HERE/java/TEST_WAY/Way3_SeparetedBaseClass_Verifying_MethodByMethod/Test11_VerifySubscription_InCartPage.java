package TEST_WAY.Way3_SeparetedBaseClass_Verifying_MethodByMethod;

import Utilities.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test11_VerifySubscription_InCartPage extends Driver {

    Actions actions ;

    @Test(priority = 1)
//2. Navigate to url 'http://automationexercise.com'
    public void Navigate() {

        String url = "https://www.automationexercise.com/";
        driver.get(url);
    }

    @Test(priority = 2)
    //3. Verify that home page is visible successfully
    public void VerifyHomepagevisibility() {
        WebElement homePageVisibility = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());
    }

    @Test(priority = 3)
//4. Click 'Cart' button
    public void ClickCartButton() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
    }

    @Test(priority = 4)
//5. Scroll down to footer
    public void ScroolDown() {
       actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Test(priority = 5)
//6. Verify text 'SUBSCRIPTION'
    public void VerifySubscriptionText() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assertions.assertTrue(driver.findElement(By.xpath("//*[text()='Subscription']")).isDisplayed());
    }

    @Test(priority = 6)
    //7. Enter email address in input and click arrow button
    public void EnteringEmail() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions=new Actions(driver);
        actions.sendKeys(driver.findElement(By.id("susbscribe_email"))).click().
                sendKeys("ab@bcde.com").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();
    }

    @Test(priority = 7)
//8. Verify success message 'You have been successfully subscribed!' is visible
    public void VerifySuccessfully() {
        Assertions.assertTrue(driver.findElement(By.xpath("//*[@id=\"success-subscribe\"]/div")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"success-subscribe\"]/div")).getText());
    }
}
