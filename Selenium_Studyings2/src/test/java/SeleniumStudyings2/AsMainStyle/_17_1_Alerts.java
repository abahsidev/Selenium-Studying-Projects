package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_1_Alerts {
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

      WebElement alertbuttonElement = driver.findElement(By.xpath("//button[@id='alertButton']"));
      alertbuttonElement.click();
     Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
   driver.switchTo().alert().accept();//alert accepting
        //   driver.switchTo().alert().dismiss();//alert denying

driver.quit();
    }
}
