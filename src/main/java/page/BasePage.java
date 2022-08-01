package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class BasePage {


    public int randomNumGenerator() {
        Random rnd = new Random();
        int randomNum = rnd.nextInt(999);
        return randomNum;
    }

    public void selectFromDropdown(WebElement element, String selectByVisibleText) {
        Select sel = new Select (element);
        sel.selectByVisibleText(selectByVisibleText);
    }
}
