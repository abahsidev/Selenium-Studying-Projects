package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _19_2_Frames_2_ParentandChild {

    public static void main(String[] args) throws InterruptedException {
        String driverlocation = "C:/Users/USER/Desktop/DriverS/chromedriver/chromedriver.exe";
        String driverlocation2 = "C:/Users/cemal/Desktop/selenium-chrome/chrome/chromedriver.exe";
        //////////////    //////////////
        String webdriveR = "webdriver.chrome.driver";
//p[text()="Child Iframe"]

        System.setProperty(webdriveR, driverlocation2);
        WebDriver driverD = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "nestedframes";
        driverD.get(mainurl + parturl);
        driverD.manage().window().maximize();
        Thread.sleep(5000);


        //aşağıda frame geçemk ZORUNLU
        driverD.switchTo().frame("frame1");//frame1 ile ana frame geçmeliyiz
        WebElement parent = driverD.findElement(By.xpath("//body[text()='Parent frame']"));
        System.out.println(parent.getText());

        driverD.switchTo().frame(0);//yukarıda frame2 dedik ama öyle bir ey yok önce paretn frame sonra childi frame
        WebElement parent2 = driverD.findElement(By.tagName("p"));//herhangi bir atanması yok sadece tag var sadece bunula albildik
        System.out.println(parent2.getText());


      //  merdiven çıkar gibi child dan en yukarı çıktık
driverD.switchTo().parentFrame();
driverD.switchTo().parentFrame();

    }

}
