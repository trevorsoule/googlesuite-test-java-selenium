package googletest.pageobjects;

import googletest.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ResultsPage extends BasePage {
    public ResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='g']/div")
    private List<WebElement> searchResults;

    @FindBy(css = "div[data-attrid*='image'] > a > g-img > img")
    private List<WebElement> resultImages;

    @FindBy(linkText = "Images")
    private WebElement imagesLink;

    public List<WebElement> getSearchResults() {
        return searchResults;
    }

    public List<WebElement> getImageResults() {
        return resultImages;
    }

    public void validateFeelingLuckyPage() {
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("Duck".toLowerCase()));
    }

    public void isPageOpen(String searchTerm) {
        Assert.assertEquals(driver.getTitle(), searchTerm + " - Google Search");
    }
}
