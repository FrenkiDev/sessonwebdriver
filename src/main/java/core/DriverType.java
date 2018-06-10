package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum DriverType implements DriverSetup{
    CHROME{
        @Override
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
            return new ChromeDriver();
        }
    };
}
