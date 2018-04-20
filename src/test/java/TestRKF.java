import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Page;
import page.RKFPage;

public class TestRKF {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{
            Page rkfPage= new RKFPage(driver);
            rkfPage.getNews();
        }finally {
            driver.close();
        }
    }
}
