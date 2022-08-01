package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.ToggleCheckValidationPage;
import util.BrowserFactory;

public class ToggleCheckValidationTest {

    WebDriver driver;

    @Test
    public void toggleCheckValidation() {

        driver = BrowserFactory.init();

        ToggleCheckValidationPage togglePage = PageFactory.initElements(driver, ToggleCheckValidationPage.class);
        //ToggleCheckValidationPage togglePage = new ToggleCheckValidationPage(driver);
        togglePage.validate_toggle_all_isOn();
        togglePage.check_All_Boxes();
        togglePage.validate_toggle_all_isOff();
        togglePage.validate_toggle_check_single_remove();
        togglePage.remove_all_checked_boxes();
        BrowserFactory.tearDown();
    }

}
