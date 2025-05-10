package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {




    private final By addbasketLocator = By.className("addBasketUnify");


    public ProductDetailPage(WebDriver driver) {
    super(driver);
    }

    public void addTocart() {
        driver.findElement(addbasketLocator).click();
    }
}
