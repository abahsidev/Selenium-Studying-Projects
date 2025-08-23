package TEST_WAY.Way2_WithLaunchMetodAndTestAnnotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

//until this case ,we will use  base classes .we won't code  setUp and tearDown methods here anymore

public class Test9_SearchProduct {
    protected WebDriver driver;
    SoftAssert softAssert;


    @BeforeClass
    //1. Launch browser
    public void setUp() {

        WebDriverManager.operadriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        softAssert = new SoftAssert();

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void TEST9() {
        //2. Navigate to url 'http://automationexercise.com'
        String url = "https://automationexercise.com";// remember https alltime
        driver.get(url);
        //3. Verify that home page is visible successfully
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement homePageVisibility = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());


        //4. Click on 'Products' button*/
        driver.findElement(By.xpath("//*[@href=\"/products\"]")).click();


        //5. Verify user is navigated to ALL PRODUCTS page successfully

        Assertions.assertEquals("https://automationexercise.com/products", driver.getCurrentUrl(), "wrong url try again");


        //6. Enter product name in search input and click search button


        WebElement enterNameElement = driver.findElement(By.xpath("//input[@placeholder='Search Product']"));
        enterNameElement.click();
        enterNameElement.sendKeys("dress");
        driver.findElement(By.id("submit_search")).click();

//7. Verify 'SEARCHED PRODUCTS' is visible
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()='Searched Products']")).isDisplayed());
//8. Verify all the products related to search are visible
        List<WebElement> SearchedProducts = driver.findElements((By.xpath("//*[text()='Searched Products']")));
        softAssert.assertTrue(SearchedProducts.size() > 0);
    }
}






