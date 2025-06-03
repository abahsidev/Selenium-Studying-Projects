package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_Actions_Dynamic2xx {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = "C:/Users/USER/Desktop/DriverS/chrome/chromedriver.exe";
        String driverlocation2 = "C:/Users/cemal/Desktop/selenium-chrome/chrome/chromedriver.exe";//alternative url
        System.setProperty("webdriver.chrome.driver", driverlocation2);
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/dynamic-properties";
        driver.get(url);
        driver.manage().window().maximize();

   /// getting text
        WebElement getTextElement = driver.findElement(By.xpath("   //p[contains(text(),'This text has random Id')]"));
        System.out.println(getTextElement.getText());

   Thread.sleep(1000);
        //enable driver bekeldikten
        WebElement enableafteR = driver.findElement(By.xpath("//button[@id='enableAfter']"));
        //Thread.sleep(5000);//method1
/*
        WebDriverWait WAIT = new WebDriverWait(driverD, 5);//method2
        WAIT.until(ExpectedConditions.elementToBeClickable(enableafteR)).click();
*/

        //nasıl kırmızaya döndü farkı görme bunun için dinamik texti alabip karşılaştırma yapabiirz.

 /*     WebElement colorchanging= driver.findElement(By.xpath("//button[text()='Color Change']"));
        System.out.println(colorchanging.getAttribute("class"));  //classs daki yazıyı al

//       WebDriverWait WAIT2 = new WebDriverWait(driverD, 5);//method2
//        WAIT2.until(ExpectedConditions.attributeToBe(colorchanging,"class","mt-4 text-danger btn btn-primary"));
//
//        System.out.println(colorchanging.getAttribute("class"));//test uzun sürdüğü için ilk girşi alamıyor.değerler aynı çıkıyor

*/

    }
}
