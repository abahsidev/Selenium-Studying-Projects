package TEST_WAY.Way2_WithLaunchMetodAndTestAnnotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class Test8_VerifyAllProducts {


    WebDriver driver;
    SoftAssert softAssert;


    @BeforeClass
    //1. Launch browser
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        softAssert = new SoftAssert();

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void TEST8() throws InterruptedException {
        Actions actions = new Actions(driver);
//2. Navigate to url 'http://automationexercise.com'
        String url = "https://automationexercise.com";// remember https alltime
        driver.get(url);
//3. Verify that home page is visible successfully
        softAssert.assertTrue(driver.findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]")).isDisplayed());
//4. Click on 'Products' button
        driver.findElement(By.xpath("//*[@href=\"/products\"]")).click();
//5. Verify user is navigated to ALL PRODUCTS page successfully
        softAssert.assertEquals("https://automationexercise.com/products", driver.getCurrentUrl(), "wrong url try again");
//6. The products list is visible
        //we check all product list's size>0
        List<WebElement> ListProducts = driver.findElements((By.xpath("//*[text()='View Product']")));
        softAssert.assertTrue(ListProducts.size() > 0);

        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//7. Click on 'View Product' of first product
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath("(//*[text()='View Product'])[1]")).click();

//8. User is landed to product detail page
        //we verify product's name that we chosen
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Blue Top\"]")).isDisplayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        //we verify product's category that we chosen
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Category: Women > Tops\"]")).isDisplayed());
        //we verify product's price that we chosen
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Rs. 500\"]")).isDisplayed());
        //we verify product's availability that we chosen
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()=\" In Stock\"]")).isDisplayed());
        //we verify product's condition that we chosen
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()=\" New\"]")).isDisplayed());
        //we verify product's brand that we chosen
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()=\" Polo\"]")).isDisplayed());

    }


}
