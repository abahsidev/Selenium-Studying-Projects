package SeleniumStudyings2.AsMainStyle;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class _12_BrokenLİnks {
    public static void main(String[] args) throws InterruptedException, IOException {
        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverlocation);
        //////////////    //////////////
        String webdriver = "webdriver.chrome.driver";

        //////////////    //////////////
        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/";
        driver.get(url);

        driver.manage().window().maximize();


        // how to get status code
        HttpClient client = HttpClientBuilder.create().build();
        String link1=("https://the-internet.herokuapp.com/status_codes/500");
        String link2=("https://demoqa.com/");
        HttpGet request = new HttpGet(link2);
        HttpResponse response = client.execute(request);
        int httpstatus = response.getStatusLine().getStatusCode();
        System.out.println(httpstatus);


    }
}
