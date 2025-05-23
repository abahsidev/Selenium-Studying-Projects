package TEST;

import PAGES.ProductDetailPage;
import PAGES.ResultPage;
import PAGES.TabBarPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestPage extends Driver {
    TabBarPage tabBarPage;
    ResultPage resultPage;
    ProductDetailPage productDetailPage;

    @Test(priority = 1)
    public void searchTest() throws InterruptedException {

        tabBarPage = new TabBarPage(driver);
        tabBarPage.searchingword("laptop");
    }

    @Test(priority = 2)
    public void resultpageTest() {
        resultPage = new ResultPage(driver);
        softAssert.assertTrue(resultPage.getResultWebelement().isDisplayed());

    }

    @Test(priority = 3)
    public void addToCartTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addTocart();

        softAssert.assertTrue(tabBarPage.getbasketNumber().equals("1"));
    }

}

