package TEST;

import PAGES.ProductDetailPage;
import PAGES.ResultPage;
import PAGES.TabBarPage;
import org.testng.annotations.Test;

public class TestPage extends Driver {
    TabBarPage tabBarPage;
    ResultPage resultPage;
    ProductDetailPage productDetailPage;

    @Test(priority = 1)
    public void searchTest() throws InterruptedException {
        driver.get("https://www.n11.com");
        tabBarPage = new TabBarPage(driver);
        tabBarPage.searchingword("laptop");
    }

    @Test(priority = 2)
    public void resultpageTest() {
        resultPage = new ResultPage(driver);
        softAssert.assertTrue(resultPage.getResultWebelement().isDisplayed());
        resultPage.clickToFirstProduct();
    }

    @Test(priority = 3)
    public void addToCartTest() {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addTocart();

        softAssert.assertTrue(tabBarPage.getbasketNumber().equals("1"));
    }

}

