package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage extends BasePage {

    private final By searchword=By.id("searchData");
    private final By basketTotal=By.className("basketTotalNum");


    public TabBarPage(WebDriver driver) {
        super(driver);
    }

    public void searchingword(String name){
        driver.findElement(searchword).sendKeys(name+ Keys.ENTER);

    }

public String getbasketNumber(){
    return  driver.findElement(basketTotal).getText();
}
}

