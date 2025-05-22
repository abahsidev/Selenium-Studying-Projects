package Selenium_Studyings1;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class S20_FileExistChecking_ExcellenMethod {
    @Test
    public void Test() throws InterruptedException {
        String indirilenler = "\\Downloads\\sampleFile.jpeg";
        String dosyayolu = System.getProperty("user.home") + indirilenler;
        Boolean expect = Files.exists(Paths.get(dosyayolu));
        if (expect) {
            System.out.println("TEST  PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }
    }

}


