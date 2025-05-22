package Selenium_Studyings1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class S11_DropdownX {


    @Test
    public void Test() throws InterruptedException {
        String webdriver = "webdriver.chrome.drive";
        String driverlocation = ".idea/driver/chromedriver.exe";
        System.setProperty(webdriver, driverlocation);
        ChromeDriver driver = new ChromeDriver();
        String mainurl = "https://www.amazon.com/";
        String parturl = "ref=nav_bb_logo";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //accept cookies
        WebElement cookies = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
        cookies.click();

        WebElement drop = driver.findElement(By.id("searchDropdownBox"));
        drop.click();


        Select select =new Select(drop);
//Method1
        select.selectByIndex(3);//beuty and ..
        System.out.println(select.getFirstSelectedOption().getText());

        //Method2

        select.selectByValue("search-alias=beauty-intl-ship");
        System.out.println(select.getFirstSelectedOption().getText());

//Method3
        select.selectByVisibleText("Health & Household");
        System.out.println(select.getFirstSelectedOption().getText());

//Method4 all options
        List<WebElement> alloptions= select.getOptions();

    /* for(int i=0;i<alloptions.size();i++){//for (WebElement w:alloptions)
         System.out.println((i+1)+" :"+alloptions.get(i).getText());

            IT WORKED
     }*/
        int sayaç=0;
        for (WebElement w:alloptions) {

            System.out.println(sayaç+ " :" + w.getText());
            sayaç++;
           // IT WORKED
        }


}}
