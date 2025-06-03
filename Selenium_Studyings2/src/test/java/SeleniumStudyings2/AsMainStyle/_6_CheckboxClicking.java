package SeleniumStudyings2.AsMainStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_CheckboxClicking {

    @Test
    public void test()throws InterruptedException {



            String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverlocation);
            WebDriver driver = new ChromeDriver();

//Various URL values ​​are available here
        String mainurl1 = "https://www.amazon.com";
        String mainurl2 = "https://the-internet.herokuapp.com";
        String mainurl3 = "https://selenium08.blogspot.com";
        String mainurl4 = "https://demoqa.com";
        String mainurl5 = "https://html.com/tags/iframe/";
        String parturl = "/checkbox";

        driver.get(mainurl4+parturl);
        //--------------------------------------------------------
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //----



        String checkboxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";

        WebElement checkboxclicking = driver.findElement(By.cssSelector(checkboxCssValue));
        Thread.sleep(2000);
        checkboxclicking.click();
        checkboxclicking = driver.findElement(new By.ByCssSelector(checkboxCssValue));


//Here we will test whether checkbox is clicked here
        //according to class value,we will get attribute situation
        String checkboxClassName = checkboxclicking.getAttribute("class");
        if (checkboxClassName.equals("rct-icon rct-icon-check")) {

            System.out.println("checkbox is clicked");
            System.out.println("test passed ");
        }
        else {
            System.out.println("unclicked");
        }


    }}
