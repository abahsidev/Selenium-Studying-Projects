package TEST;

import PAGES.DemoQaPracticeForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class Driver {

   protected WebDriver driver;

protected DemoQaPracticeForm demoQaPracticeForm;

    @BeforeClass
    public void setUp() {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        demoQaPracticeForm = new DemoQaPracticeForm(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();


    }
}
