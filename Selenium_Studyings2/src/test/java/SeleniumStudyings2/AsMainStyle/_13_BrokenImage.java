package SeleniumStudyings2.AsMainStyle;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Scanner;

public class _13_BrokenImage {
    public static void main(String[] args) throws IOException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);
        //////////////    //////////////
        String webdriver = "webdriver.chrome.driver";

        //////////////    //////////////
        System.setProperty(webdriver, driverlocation);
        WebDriver driver= new ChromeDriver();

        Scanner scanner = new Scanner(System.in);
        System.out.println("url gir : ");
        String url = scanner.nextLine();

        //String url = "https://demoqa.com/broken";
        driver.get(url);
        driver.manage().window().maximize();

        //////////////    //////////////
//      alternatifli seçimler
        String xpathway1="//div/img[2]";
        String xpathway2="//img[@src='/images/Toolsqa_1.jpg']";

      WebElement brokenimage=driver.findElement(By.xpath(xpathway1));


        // how to get status code
        String  brokenimageurl=brokenimage.getAttribute("src");//image ait değer tipi
        System.out.println(brokenimageurl);

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(brokenimageurl);
        HttpResponse responsEe = client.execute(request);
        int httpstatus = responsEe.getStatusLine().getStatusCode();
        System.out.println(httpstatus);


    }
}
