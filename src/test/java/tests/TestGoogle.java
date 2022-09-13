package tests;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchPage;
import testbase.TestBase;

public class TestGoogle extends TestBase {

    @Parameters("word")
    @Test
    public void testGoogle(String searchWord) {
        AqualityServices.getLogger().info("Starting testing of google");
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main page isn't opened");
        mainPage.fillSearchBox(searchWord);
        mainPage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        Assert.assertTrue(searchPage.state().isDisplayed(), "Search page isn't opened");
    }

}
