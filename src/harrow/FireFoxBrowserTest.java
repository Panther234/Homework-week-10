package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize window
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}
