package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_textsearch {
    public static void main(String[] args) throws InterruptedException {

        String webdriver = "webdriver.chrome.drive";
       String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();

        String url="https://demoqa.com/text-box";
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("url gir: ");

        String url = scanner.nextLine();*/
// for loop
        for (int i=1;i < 5;i++){

            driver.get(url);
            Thread.sleep(3000);
            driver.manage().window().maximize();
            Thread.sleep(3000);
            WebElement clickandwrite = driver.findElement(By.xpath("//input[@id='userName']"));
            clickandwrite.click();
            clickandwrite.sendKeys("atikus"+i);
        }

      Thread.sleep(5000);

      driver.close();


    }
}
