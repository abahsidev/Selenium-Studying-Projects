package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _24_Slider {

    WebDriver driver;

    @Test
    public void SlidingTests() {

        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "slider";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();

        WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));


        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, -5, 0).perform();
//it reads value on slider
        WebElement onSliderValue = driver.findElement(By.cssSelector(".range-slider__tooltip__label"));
        System.out.println("on slider value :" + onSliderValue.getText());
//it reads value in box
        WebElement inBoxValue = driver.findElement(By.id("sliderValue"));
        System.out.println("in box value : " + inBoxValue.getAttribute("value"));

        if (onSliderValue == inBoxValue) {
            System.out.println("values ara equal");

        } else {
            System.out.println("Values are not equal.It must be calibrated");
        }

//Even if it seems equal at two values, there may be mistakes on the decimal side
    }
}
