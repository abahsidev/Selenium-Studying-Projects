package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NavigateDriver extends Driver {
    @Test(priority = 1)
    public void navigate() throws InterruptedException {
        String url = "https://demoqa.com/forms";
        driver.get(url);

        driver.findElement(By.xpath("(//*[text()=\"Practice Form\"])[1]")).click();
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();


    }
}
