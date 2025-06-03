package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _18_Frames_1 {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);

        WebDriver driver = new ChromeDriver();

//        Scanner scanner = new Scanner(System.in);

//        System.out.println("url gir : ");
//        String url = scanner.nextLine();

        String mainurl = "https://demoqa.com/";
        String parturl = "frames";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();

        //method1
        // driver.switchTo().frame(0);
        //method2
        driver.switchTo().frame("frame1");//we define pass frame which We want

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(2000);
        System.out.println(heading.getText());


        //get out  to ParentFrame
        driver.switchTo().parentFrame(); //here is ParentFrame
        List<WebElement> parent = driver.findElements(By.cssSelector("div[id='framesWrapper'] div"));
        String paragraph = parent.get(0).getText();
        System.out.println(paragraph);


    }
}
