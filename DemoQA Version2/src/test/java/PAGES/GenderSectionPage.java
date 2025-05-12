package PAGES;

import TEST.NavigateDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSectionPage extends NavigateDriver {
    protected WebDriver driver;
    private final By MaleLabel = By.xpath("//label[@for=\"gender-radio-1\"]");//to click male button
    private final By FemaleLabel = By.xpath("//label[@for=\"gender-radio-2\"]");//to click female button
    private final By OtherLabel = By.xpath("//label[@for=\"gender-radio-3\"]");//to click  other button

    public enum Genders {female, male, other}

    private final By MaleRadioButton= By.id("gender-radio-1");// to check clicked button or not
    private final By FemaleRadioButton = By.id("gender-radio-2");// to check clicked button or not
    private final By OtherRadioButton = By.id("gender-radio-3");// to check clicked button or not

    ;

    public GenderSectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickRadioButton(Genders gender) {

        switch (gender) {
            case male:
                driver.findElement(MaleLabel).click();
                break;
            case female:
                driver.findElement(FemaleLabel).click();
                break;
            case other:
                driver.findElement(OtherLabel).click();
                break;
            default:
                driver.findElement(MaleLabel).click();
                break;
        }

    }


    public boolean IsChecked(Genders gender) {
        boolean IsChecked = false;
        switch (gender) {
            case male:
                IsChecked = driver.findElement(MaleRadioButton).isSelected();
                break;
            case female:
                IsChecked = driver.findElement(FemaleRadioButton).isSelected();
                break;
            case other:
                IsChecked =driver.findElement(OtherRadioButton).isSelected();
                break;   }
           return IsChecked;



    }
}
