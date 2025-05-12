package TEST;

import PAGES.GenderSectionPage;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Gender extends NavigateDriver {
    @Test(priority = 2)

    public void MaleRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        practiceFormPage.genderSectionPage().ClickRadioButton(GenderSectionPage.Genders.male);

    }

    @Test(priority = 3)
    public void FemaleRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        practiceFormPage.genderSectionPage().ClickRadioButton(GenderSectionPage.Genders.female);
        Assertions.assertTrue(practiceFormPage.genderSectionPage().IsChecked(GenderSectionPage.Genders.female), "test failed ");
    }

    @Test(priority = 4)
    public void OtherRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        practiceFormPage.genderSectionPage().ClickRadioButton(GenderSectionPage.Genders.other);
        Assertions.assertTrue(practiceFormPage.genderSectionPage().IsChecked(GenderSectionPage.Genders.other), "test failed ");
    }

    @Test(priority = 5)
    public void VerifyingGenderMale() throws InterruptedException {
        Thread.sleep(2000);
        Assertions.assertTrue(practiceFormPage.genderSectionPage().IsChecked(GenderSectionPage.Genders.male), "test failed ");
    }

    @Test(priority = 6)
    public void VerifyingGenderFemale() throws InterruptedException {
        Thread.sleep(2000);
        Assertions.assertTrue(practiceFormPage.genderSectionPage().IsChecked(GenderSectionPage.Genders.female), "test failed ");
    }

    @Test(priority = 7)
    public void VerifyingGenderOther() throws InterruptedException {
        Thread.sleep(2000);
        Assertions.assertTrue(practiceFormPage.genderSectionPage().IsChecked(GenderSectionPage.Genders.other), "test failed ");
    }
}

