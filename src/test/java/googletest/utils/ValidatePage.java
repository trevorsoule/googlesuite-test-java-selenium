package googletest.utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ValidatePage {

    public void validatePO(List<WebElement> searchResults, List<WebElement> imageResults, String searchTerm) {
        // Validate the results
        for (WebElement searchResult : searchResults) {
            if (searchResult.isDisplayed()) {
                Assert.assertTrue(searchResult.getText().toLowerCase().contains(searchTerm.toLowerCase()), "Search result doesn't contain search term '" + searchTerm + "': " + searchResult.getText());
            }
        }

        // Validate the images
        for (WebElement resultImage : imageResults) {
            if (resultImage.isDisplayed()) {
                Assert.assertTrue(resultImage.getAttribute("alt").toLowerCase().contains(searchTerm.toLowerCase()), "Image alt tag doesn't contain search term '" + searchTerm + "': " + resultImage.getAttribute("alt"));
            }
        }
    }
}
