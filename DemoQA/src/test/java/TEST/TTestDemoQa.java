package TEST;



import PAGES.DemoQaPracticeForm;
import org.testng.annotations.Test;


public class TTestDemoQa extends Driver {


    @Test(priority = 1)
    public void navigate() throws InterruptedException {
        String url = "https://demoqa.com/forms";
        driver.get(url);
    }

    @Test(priority = 2)
    public void setName() throws InterruptedException {

        demoQaPracticeForm.SetName("benim_adım");
    }

    @Test(priority = 3)
    public void setLastName() throws InterruptedException {

        demoQaPracticeForm.SetLastName("benim_soyadım");
    }

    @Test(priority = 4)
    public void setEmail() throws InterruptedException {

        demoQaPracticeForm.SetEmail("alfa@beta.com");
    }
}
