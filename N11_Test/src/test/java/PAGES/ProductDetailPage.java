package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {




    private final By addbasketLocator = By.xpath("(//*[@class=\"btnBasket\"])[1]");


    public ProductDetailPage(WebDriver driver) {
    super(driver);
    }

    public void addTocart() {
        driver.findElement(addbasketLocator).click();
    }




}
