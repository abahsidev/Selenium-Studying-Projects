package SeleniumStudyings2.AsTestStyle;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _23_DatePicker {
    WebDriver driver;

    @Test

    public void datepicker() throws InterruptedException {

        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverlocation);
        driver = new ChromeDriver();
        String mainurl = "https://demoqa.com/";
        String parturl = "date-picker";
        driver.get(mainurl + parturl);
        driver.manage().window().maximize();
        Thread.sleep(500);
        datepicker2("2005","May","15");

}


public void datepicker2(String year,String month,String day){
        WebElement datepickerElement = driver.findElement(By.id("datePickerMonthYearInput"));
        datepickerElement.click();

        WebElement monthelement = driver.findElement(By.className("react-datepicker__month-select"));
        Select select = new Select(monthelement);
        select.selectByVisibleText(month);

        WebElement yearelement = driver.findElement(By.className("react-datepicker__year-select"));

        select = new Select(yearelement);
        select.selectByVisibleText(year);


        List<WebElement> dayElement = driver.findElements(By.cssSelector("div.react-datepicker__day"));

        for (WebElement pickk : dayElement) {
            String data_selecting = pickk.getText();
            if (data_selecting.equals(day)) {

           pickk.click();

                break;

            }

            //it gets current time as date and hour
            WebElement currentDateGettext=driver.findElement(By.id("dateAndTimePickerInput"));
            System.out.println(currentDateGettext.getAttribute("value"));

        }}


    }

