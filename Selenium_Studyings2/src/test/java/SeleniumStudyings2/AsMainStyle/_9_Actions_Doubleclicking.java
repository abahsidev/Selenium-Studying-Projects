package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _9_Actions_Doubleclicking {
    public static void main(String[] args) throws InterruptedException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);

        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/buttons";
        driver.get(url);
        Thread.sleep(3000);
        driver.manage().window().maximize();


        WebElement doubleClickingElement = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        WebElement rightClickingElement = driver.findElement(By.cssSelector("#rightClickBtn"));


        //We need "Actions" Command to create "doubleclicking" command

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickingElement).perform();

        WebElement messsageElement = driver.findElement(By.cssSelector("#doubleClickMessage"));
        System.out.println(messsageElement.getText());

        if (messsageElement.getText().contains("You have done a double click")) {
            System.out.println("TEST PASSED");
        }


        Thread.sleep(3000);
        //rightclick locating
        actions.contextClick(rightClickingElement).perform();
        WebElement messsageElement2 = driver.findElement(By.cssSelector("#rightClickMessage"));
        System.out.println(messsageElement2.getText());

        Thread.sleep(3000);
        //  driver.quit();
    }


}