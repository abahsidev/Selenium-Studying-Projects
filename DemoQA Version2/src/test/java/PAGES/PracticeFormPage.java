package PAGES;

import TEST.Driver;
import TEST.NavigateDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PracticeFormPage extends NavigateDriver {

protected WebDriver driver;
    private final By enterName = By.id("firstName");
    private final By enterLastName = By.id("lastName");
    private final By enterEmail = By.id("userEmail");
    private final GenderSectionPage genderSectionPage;//this code means Gendersection... is a child of PracticeformPage

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        genderSectionPage=new GenderSectionPage(driver);
    }
//we have to do this .why? we need to reach gendersection class
    public GenderSectionPage genderSectionPage() {
       return this.genderSectionPage;
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

    public String getEnterName() {
        WebElement NAME= driver.findElement(enterName);
        return NAME.getAttribute("value");//you will get name that you enter
    }
}
