package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _16_1_Window_NewTab {
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
        String parturl = "browser-windows";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement tabButtonElement = driver.findElement(By.id("tabButton"));
        tabButtonElement.click();


// howmany tabs exist ,we sent to List
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //how many tabs are written
        System.out.println(tabs.size());

      //to pass to first tab
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(0));
        //gets active tab url

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        // just the active page is closed
        driver.close();
       // driver.quit() closes all pages so it ends the test finally

    }
}
