import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.Constants;

import static core.DriverFactory.getWebdriver;
import static core.DriverFactory.quitWebDriver;
public class TestBase {
    private String urlName;

    public TestBase(String url) {
        this.urlName = url;
    }

    @Before
    public void instantiateDriverObject() {
        String sessionId = ((RemoteWebDriver) getWebdriver()).getSessionId().toString();
        getWebdriver().manage().deleteAllCookies();
        getWebdriver().manage().window().maximize();
        getWebdriver().get(Constants.getUrl(urlName));

    }

    @After
    public void closeDriverObjects() {
        quitWebDriver();
    }
}
