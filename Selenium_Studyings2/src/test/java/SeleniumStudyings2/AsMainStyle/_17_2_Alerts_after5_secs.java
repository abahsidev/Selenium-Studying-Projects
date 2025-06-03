package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _17_2_Alerts_after5_secs {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";

        //////////////    //////////////
        String webdriver = "webdriver.chrome.driver";


        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();


//        Scanner scanner = new Scanner(System.in);

//        System.out.println("url gir : ");
//        String url = scanner.nextLine();

        String mainurl = "https://demoqa.com/";
        String parturl = "alerts";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement alertbuttonTimer = driver.findElement(By.id("timerAlertButton"));
        alertbuttonTimer.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(115));
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(driver.switchTo().alert().getText());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().alert().accept();//alert accepting
        // driver.switchTo().alert().dismiss();//alert denying

        driver.quit();
    }
}
