package testbase;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    private final ISettingsFile environment = new JsonSettingsFile("settings.json");
    private final String url = environment.getValue("/remoteConnectionUrl").toString();

    @BeforeMethod
    protected void setUp() {
        AqualityServices.getBrowser().maximize();
        AqualityServices.getBrowser().goTo(url);
    }

    @AfterMethod
    protected void tearDown() {
        AqualityServices.getBrowser().quit();
    }

}
