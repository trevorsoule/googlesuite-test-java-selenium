package googletest.pageobjects;

import googletest.utils.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    @FindBy(name = "btnI")
    private WebElement feelingLuckyBtn;

    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void inputSearchTerm(String searchTerm) {
        if (isPageOpened()) {
            searchBox.sendKeys(searchTerm);
        }
    }

    public void pressEnterToSearch() {
        searchBox.sendKeys(Keys.ENTER);
    }

    public void clickSearchButton() {
        waitFor(searchBtn).click();
    }

    public void clickFeelingLuckyButton() {
        waitFor(feelingLuckyBtn).click();
    }

    public boolean isPageOpened() {
        return driver.getTitle().equals("Google");
    }
}
