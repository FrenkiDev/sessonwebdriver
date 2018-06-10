package modes.exhibitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Constants.WAIT_EXPLICIT_SEC;

public abstract class Page {
    protected WebDriver drivers;
    protected WebDriverWait wait;

    public Page(WebDriver drivers) {
        this.drivers = drivers;
        PageFactory.initElements(this.drivers, this);
        wait = new WebDriverWait(drivers, WAIT_EXPLICIT_SEC);
    }
}
