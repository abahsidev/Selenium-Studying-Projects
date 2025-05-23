package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage {

    private final By resultTextLocator = By.xpath("//div[@class=\"resultText \"] ");
    private final By productnameLocator = By.xpath("(//*[@class='productName'])[1]");

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultWebelement() {
        return driver.findElement(resultTextLocator);//total sonuçalrı bu şekilde al
    }

    //geriye değer döndürmeycek void bu yüzden
    public void clickToFirstProduct() {
        driver.findElement(productnameLocator).click();
    }

}
