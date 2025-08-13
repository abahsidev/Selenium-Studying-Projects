package TEST_WAY.Way1_inMainClass;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1_RegisterUser {
    public static void main(String[] args) {
        /*REMEMBER IF YOU GET
        SessionNotCreatedException
        This exception occurs when the WebDriver is unable to create a new session for the browser. This often happens due to version mismatches, system-level restrictions, or configuration issues.

        Likely Cause
        The browser version and WebDriver version are incompatible (e.g., ChromeDriver v113 with Chrome v115).
        macOS privacy settings may block the WebDriver from running.
                The WebDriver binary is missing, inaccessible, or lacks the necessary execution permissions (e.g., on Linux/macOS, the driver file may not be executable).
                Possible Solutions
        Ensure the WebDriver version matches the browser version. For Chrome, check the browser version at chrome://settings/help and download the matching driver from ChromeDriver Downloads.
        On macOS, go to System Settings > Privacy & Security, and allow the driver to run if blocked.
                Verify the driver binary is executable*/

        //1. Launch browser
//here We use the driver from package in driverpath(like below address).
        String webdriver = "webdriver.chrome.drive";
        String Computerlocation = System.getProperty("user.home");
        String driverpath = "IdeaProjects\\Selenium_in_automationexercises\\src\\driver";

        System.setProperty(webdriver, Computerlocation + driverpath);
        WebDriver driver = new ChromeDriver();


//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//3. Verify that home page is visible successfully
        WebElement homePageVisibility = driver.findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]"));
        Assertions.assertTrue(homePageVisibility.isDisplayed());
//4. Click on 'Signup / Login' button
        WebElement signoutLink = driver.findElement(By.xpath(" //*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        signoutLink.click();
//5. Verify 'New User Signup!' is visible
        WebElement NewUSer = driver.findElement(By.xpath("(//h2[\"New User Signup!\"])[3]"));
        Assertions.assertTrue(NewUSer.isDisplayed());

//6. Enter name and email address
// 7. Click 'Signup' button
        Actions actions = new Actions(driver);
        WebElement signOutname = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(signOutname).
                sendKeys("atilla").
                pause(1).
                sendKeys(Keys.TAB).
                pause(1).
                sendKeys("ab3@baba.com").
                pause(1).
                sendKeys(Keys.TAB).
                pause(1).
                sendKeys(Keys.ENTER).
                perform();


//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement EAIverfiying = driver.findElement(By.xpath("//b[text()=\"Enter Account Information\"]"));
        Assertions.assertTrue(EAIverfiying.isDisplayed());
//9. Fill details: Title, Name, Email, Password, Date of birth
// 10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
        WebElement genderRadio = driver.findElement(By.xpath("//label[@for=\"id_gender1\"]"));
        actions.click(genderRadio).
                sendKeys(Keys.TAB).pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("123456").pause(1).
                sendKeys(Keys.ARROW_DOWN).

                sendKeys(Keys.TAB).pause(1).
                sendKeys(Keys.PAGE_DOWN).pause(1).
                sendKeys("5").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("May").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("2000").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys(Keys.PAGE_DOWN).pause(1).
                sendKeys(Keys.ARROW_DOWN).pause(1).
                sendKeys("atilla").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("bahsi").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("bendeniz").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("Istanbul").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys("Ordu").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("Canada").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("Istanbul").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("Samsun").pause(1).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("123456").pause(1).
                sendKeys(Keys.TAB).pause(1).
                sendKeys("123456").pause(1).
                sendKeys(Keys.TAB).pause(5).
                sendKeys(Keys.ENTER).
                perform();


//12.Verifiying Account Created text
        WebElement AccountCreated = driver.findElement(By.xpath("//b[\"Account Created!\"]"));
        Assertions.assertTrue(AccountCreated.isDisplayed());

        //13.press Continue
        driver.findElement(By.xpath("//*[normalize-space()='Continue']")).click();

    }


}






