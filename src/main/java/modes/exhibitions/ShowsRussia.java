package modes.exhibitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShowsRussia extends Page{
    @FindBy(xpath = "//text()[contains(.,'Интернациональная выставка собак')]/following-sibling::*")
    private WebElement dateInfo;

    @FindBy(xpath ="//*[@id=\"mcont\"]/table[@class='MsoNormalTable']")
    private List<WebElement> priche;

    @FindBy(xpath = "//text()[contains(.,'Предварительный список судей')]")
    private WebElement hrefDjude;

    @FindBy(xpath = "//*[@id=\"mcont\"]/table[2]/tbody")
    private List<WebElement> listDjudge;

    public ShowsRussia(WebDriver drivers) {
        super(drivers);
    }

    public WebElement getDateInfo() {
        return dateInfo;
    }

    public List<WebElement> getPriche() {

        return priche;
    }

    public WebElement getHrefDjude() {
        return hrefDjude;
    }

    public List<WebElement> getListDjude() {
        return listDjudge;
    }
}
