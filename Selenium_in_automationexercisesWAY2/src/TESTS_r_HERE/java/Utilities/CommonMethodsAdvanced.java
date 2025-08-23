package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethodsAdvanced extends DriverAdvanced {
    protected WebDriver driver;

    public CommonMethodsAdvanced(WebDriver driver) {
        this.driver = driver;
    }

    //this will be a common finder
    public WebElement findLocator(By Locator) {
        return driver.findElement(Locator);
    }


    //this will be a common clicker
    public void clickLocator(By Locator) {
        findLocator(Locator).click();
    }

    //this will be a common sender .it sends anyvalue as String
    public void typeLocator(By Locator, String AnyValue) {
        findLocator(Locator).sendKeys(AnyValue);
    }

    public Boolean IsSelected(By Locator) {
        return findLocator(Locator).isSelected();
    }

    public WebDriverWait WaitImplicity(Integer Time) {
        return (WebDriverWait) driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));
    }

    public WebDriverWait WaitExplicitlyToBeClickable(Integer Time, By Locator) {
        new WebDriverWait(driver, Duration.ofSeconds(Time)).
                until(ExpectedConditions.elementToBeClickable(Locator));
        return null;
    }

}
