package TEST;


import org.testng.annotations.Test;

import java.time.Duration;


public class Test_Name_LastName_Email extends NavigateDriver {




    @Test(priority = 2)
    public void setName() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        practiceFormPage.SetName("benim_adım");
        softAssert.assertEquals("benim_adı", practiceFormPage.getEnterName(),"wrong name was entered");

    }

    @Test(priority = 3)
    public void setLastName() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        practiceFormPage.SetLastName("benim_soyadım");
    }

    @Test(priority = 4)
    public void setEmail() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        practiceFormPage.SetEmail("alfa@beta.com");
    }
}
