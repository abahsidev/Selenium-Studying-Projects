package SeleniumStudyings2.AsMainStyle;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class _15_File_Uploading {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";

        //////////////    //////////////
        String webdriver = "webdriver.chrome.driver";


        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();

//        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter url : ");
//        String url = scanner.nextLine();

        String url = "https://demoqa.com/upload-download";
        driver.get(url);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement upload = driver.findElement(By.id("uploadFile"));
 // you will upload if ypu have sampleFile.jpg or file whichever  you want file path is an example
        upload.sendKeys(System.getProperty("user.home")+"/Downloads/sampleFile.jpeg");
        //verifying uploaded or not
        Assertions.assertTrue(driver.findElement(By.id("uploadedFilePath")).isDisplayed(),"test failed.file wasn't uploaded");
    }
}
