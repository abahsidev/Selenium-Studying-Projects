package Utilities;

import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExistChecking_ExcellenMethod {
    @Test
public void Test() throws InterruptedException {
    String indirilenler = "\\Downloads\\sampleFile.jpeg";
    String dosyayolu = System.getProperty("user.home") + indirilenler;
    Boolean expect = Files.exists(Paths.get(dosyayolu));
    if (expect) {
        System.out.println("test passed");

    }
    else{
        System.out.println("test failed.");
    }
}
}
