package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import testbase.TestBase;

public class TestGoogle extends TestBase {

    @Test
    public void testGoogle() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main page isn't opened");
    }

}
