package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _16_2_Window_NewWindow {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";

        //////////////    //////////////
        String webdriveR = "webdriver.chrome.driver";


        System.setProperty(webdriveR,driverlocation);
        WebDriver driver = new ChromeDriver();

//        Scanner scanner = new Scanner(System.in);

//        System.out.println("url gir : ");
//        String url = scanner.nextLine();

        String mainurl = "https://demoqa.com/";
        String parturl = "browser-windows";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement windowButtonElement = driver.findElement(By.xpath("//button[@id='windowButton']"));
        windowButtonElement.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());


        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.close();//hangi sayfadaysa orayı kapatır






    }
}
