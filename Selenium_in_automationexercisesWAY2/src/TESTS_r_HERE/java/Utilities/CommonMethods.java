package Utilities;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CommonMethods extends Driver {

    @Test(priority = 1)
    public void Navigate() {
        //2. Navigate to url 'http://automationexercise.com'
        String url = "https://www.automationexercise.com/";
        driver.get(url);



        }
        @Test(priority = 2)
        //3. Verify that home page is visible successfully
        public void VerifyHomePageVisibil() {
            WebElement HomePageVisibility = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
            Assertions.assertTrue(HomePageVisibility.isDisplayed());
        }
    }

