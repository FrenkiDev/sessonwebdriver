package controler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ControlerWebPath {
    public static WebElement getWebElemet(WebDriver locDriwer, By locLocator) {
        WebElement webElements = new WebDriverWait(locDriwer, 30).until(ExpectedConditions.presenceOfElementLocated(locLocator));
        return webElements;
    }

    public static List<WebElement> getListWebElemet(WebDriver locDriwer, By locLocator) {
        List<WebElement> webElements = new WebDriverWait(locDriwer, 30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locLocator));
        return webElements;
    }
}
