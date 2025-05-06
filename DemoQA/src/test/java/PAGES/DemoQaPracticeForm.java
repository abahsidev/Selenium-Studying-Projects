package PAGES;

import TEST.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DemoQaPracticeForm extends Driver{

protected WebDriver driver;
    private final By enterName = By.id("firstName");
    private final By enterLastName = By.id("lastName");
    private final By enterEmail = By.id("userEmail");

    public DemoQaPracticeForm(WebDriver driver) {

        this.driver = driver;
    }



    public void SetName(String Name) {
        WebElement name = driver.findElement(enterName);
        name.click();
        name.sendKeys(Name);
    }

    public void SetLastName(String LastName) {
        WebElement lastName = driver.findElement(enterLastName);
        lastName.click();
        lastName.sendKeys(LastName);
    }

    public void SetEmail(String Email) {
        WebElement email = driver.findElement(enterEmail);
        email.click();
        email.sendKeys(Email);
    }
}
