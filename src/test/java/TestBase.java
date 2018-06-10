import modes.exhibitions.ShowsRussia;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.Constants;

import static core.DriverFactory.getWebdriver;
import static core.DriverFactory.quitWebDriver;
public class TestBase {
    public ShowsRussia showsRussias = new ShowsRussia();
    @Before
    public void instantiateDriverObject() {
        String sessionId = ((RemoteWebDriver) getWebdriver()).getSessionId().toString();
        getWebdriver().manage().deleteAllCookies();
        getWebdriver().manage().window().maximize();
        getWebdriver().get(Constants.getUrl("rush_exhibitions"));

    }

    @After
    public void closeDriverObjects() {
        quitWebDriver();
    }
}
