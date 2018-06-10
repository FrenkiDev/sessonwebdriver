package core;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private static final Logger logger = LogManager.getLogger(DriverFactory.class);
    private static WebDriver webdriver;
    private DriverType selectedDriverType;
    private static final DriverType defaultDriverType = DriverType.CHROME;
    private static final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private static final String systemArchitecture = System.getProperty("os.arch");

    public static WebDriver getWebdriver(){
        if(webdriver == null){
            webdriver = initiWebDriver(defaultDriverType);
        }
        return webdriver;
    }

    public static void quitWebDriver(){
        webdriver.quit();
    }

    public static WebDriver initiWebDriver(DriverType selectedDriverType){
        logger.info("---");
        logger.info("Current Operating System: " + operatingSystem);
        logger.info("Current Architecture: " + systemArchitecture);
        logger.info("Current Browser Selection: " + selectedDriverType);
        logger.info("---");

        return selectedDriverType.getDriver();
    }
}
