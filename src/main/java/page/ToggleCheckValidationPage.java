package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import java.util.List;

public class ToggleCheckValidationPage extends BasePage{
    WebDriver driver;

    public ToggleCheckValidationPage(WebDriver driver) {
        this.driver = driver;
    }

    // The 'how' class contains all the method a By class contains.Define and save it
    // in a variable (element)
    @FindBy(how = How.CSS, using = "input[value='on'")
    WebElement Toggle_Check_All_Element;

   @FindBy(how = How.XPATH, using = "//input[contains(@name,'todo')]")
    WebElement Toggle_Check_Single_Element;
    @FindBy(how = How.CSS, using = "input[value='Remove'")
    WebElement Remove_Button_Element;

    public void check_All_Boxes () {

        List<WebElement> elements = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for(WebElement All_Check_Boxes_Element:elements) {
            All_Check_Boxes_Element.click();
        }
    }

    // Interactive Methods.
    public void validate_toggle_all_isOn() {
        Toggle_Check_All_Element.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Assert.assertEquals(true,Toggle_Check_All_Element .isSelected());

    }


    public void validate_toggle_all_isOff() {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(false,Toggle_Check_All_Element .isSelected());

    }


    public void validate_toggle_check_single_remove(){
        Toggle_Check_Single_Element.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        Remove_Button_Element.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(true, Toggle_Check_Single_Element.isDisplayed());
    }

    public void remove_all_checked_boxes() {
        Toggle_Check_All_Element.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        Remove_Button_Element.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Assert.assertEquals(true, Toggle_Check_Single_Element.isSelected());
    }





}
