package googletest.tests;

import googletest.pageobjects.ResultsPage;
import googletest.pageobjects.SearchPage;
import googletest.utils.BaseTest;
import googletest.utils.ValidatePage;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class GoogleSearchTests extends BaseTest {
    String searchTerm = "Ducks";

    @Description("Test searching Google using the Enter key to proceed to the results and then validate results")
    @Test
    public void searchGoogleTestUsingEnterKey() {
        Reporter.log("This test searches in Google and validates results");
        SearchPage searchPage = new SearchPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        searchPage.inputSearchTerm(searchTerm);
        searchPage.pressEnterToSearch();
        resultsPage.isPageOpen(searchTerm);

        ValidatePage validatePage = new ValidatePage();
        validatePage.validatePO(resultsPage.getSearchResults(), resultsPage.getImageResults(), searchTerm);
    }

    @Description("Test searching Google using the search button to proceed to the results and then validate results")
    @Test
    public void searchGoogleTestUsingSearchButton() {
        Reporter.log("This test searches in Google and validates results");
        SearchPage searchPage = new SearchPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        searchPage.inputSearchTerm(searchTerm);
        searchPage.clickSearchButton();
        resultsPage.isPageOpen(searchTerm);

        ValidatePage validatePage = new ValidatePage();
        validatePage.validatePO(resultsPage.getSearchResults(), resultsPage.getImageResults(), searchTerm);
    }

    @Description("Test searching Google using the 'Are You Feeling Lucky?' button and verify it pertains to the search term")
    @Test
    public void searchGoogleTestUsingFeelingLuckyButton() {
        Reporter.log("This test searches in Google and validates results");
        SearchPage searchPage = new SearchPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        searchPage.inputSearchTerm(searchTerm);
        searchPage.clickFeelingLuckyButton();
        resultsPage.validateFeelingLuckyPage();
    }
}
