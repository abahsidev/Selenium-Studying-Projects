package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _19_1_Frames_2_Ads {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("url gir : ");
//        String url = scanner.nextLine();

        String mainurl = "https://demoqa.com/";
        String parturl = "nestedframes";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(5000);

//reklamlarda birer frame mantığıyla aranacak öcne geçiş yap
        WebElement adv_cancel = driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));
        driver.switchTo().frame(adv_cancel);
        Thread.sleep(5000);
        //sonra clickle

        WebElement adv_clicK = driver.findElement(By.id("cbb"));
        adv_clicK.click();


    }
}
