package googletest.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement waitFor(WebElement el) {
        WebDriverWait wait = new WebDriverWait(driver, 120, 100);
        return wait.until(ExpectedConditions.visibilityOf(el));
    }
}
