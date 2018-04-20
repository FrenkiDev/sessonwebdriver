package page;

import controler.ControlerWebPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.annotation.Nonnull;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class RKFPage implements Page {
    private List<WebElement> menu;
    private List<WebElement> exhibitionsList;
    private Properties listPath;
    private Properties listSelector;
    private String propertisPath = "D:\\java_Project\\sessonwebdriver\\src\\main\\resources\\web_dog_patn.properties";
    private String propertisSelector = "D:\\java_Project\\sessonwebdriver\\src\\main\\resources\\rkf_locators.properties";
    private String exhibitions = "exhibitions";
    private String webPath = "rkf";
    private String menuBar = "menuBar";

    @Nonnull
    public RKFPage(WebDriver locWebDriwer) {
        initProperties(propertisPath, listPath  = new Properties());
        initProperties(propertisSelector, listSelector  = new Properties());

        locWebDriwer.get(listPath.getProperty(webPath));
        menu = ControlerWebPath.getListWebElemet(locWebDriwer, By.xpath(listSelector.getProperty(menuBar)));
        System.out.println(menu);

    }

    @Override
    public List getNews() {
        return null;
    }

    private void initProperties(String pathFileProrerties, Properties locProperties) {
        try (FileInputStream tmp = new FileInputStream(pathFileProrerties)) {
            locProperties.load(tmp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
