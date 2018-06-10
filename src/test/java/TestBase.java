import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.Constants;

import static core.DriverFactory.getWebdriver;
import static core.DriverFactory.quitWebDriver;
public class TestBase {
    private static String urlName = "rush_exhibitions";

    /*public TestBase(String url) {
        this.urlName = url;
    }*/

    @BeforeClass
    public static void instantiateDriverObject() {
        String sessionId = ((RemoteWebDriver) getWebdriver()).getSessionId().toString();
        getWebdriver().manage().deleteAllCookies();
        getWebdriver().manage().window().maximize();
        getWebdriver().get(Constants.getUrl(urlName));

    }

    @AfterClass
    public static void closeDriverObjects() {
        quitWebDriver();
    }
}
