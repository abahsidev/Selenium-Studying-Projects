package SeleniumStudyings2.AsMainStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Scanner;

public class _14_File_Downloading {
    public static void main(String[] args) {
        /// 1-Navigtate driver section


        String driverlocation = System.getProperty("user.home") + "\\IdeaProjects\\Selenium_Studyings2\\Driver\\chromedriver.exe";

        //////////////    //////////////

        String webdriver = "webdriver.chrome.driver";


        System.setProperty(webdriver, driverlocation);
        WebDriver driver = new ChromeDriver();

        //you will enter url address on the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the url : ");
        String url = scanner.nextLine();
        /* url b address >>>>
         https://demoqa.com/upload-download
                <<<<<<<copy and  paste that url  on it when  ask for you
         */

        driver.get(url);
        driver.manage().window().maximize();

        /// 2-download Location section to download file
        WebElement download = driver.findElement(By.cssSelector("#downloadButton"));
        download.click();

        /// 3-place that downloaded file will be here(Desktop,Download,any case on your computer etc.)
        String path = "C/Users/USER/Downloads";
        String downloadedFile = "sampleFile.jpeg";


        /// 3-verifing file was downloaded or not
        boolean verifing=file_existing_veryfing(path, downloadedFile);
        System.out.println(verifing);
    }


   public static boolean file_existing_veryfing(String downloadPath, String searched) {


        File x_file = new File(downloadPath);// remember iconic serial XFiles☻☻☻☻
        File[] files = x_file.listFiles();//scanning all files in the related case to find downloaded file

        for (int i = 0; i < files.length; i++) {

            if (files[i].getName().equals(searched)) {



                return true;

            }

        }

        return false;

    }

}