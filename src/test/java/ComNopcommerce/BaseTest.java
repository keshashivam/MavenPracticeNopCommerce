package ComNopcommerce;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by KAVITA on 10/05/2017.
 */
public class BaseTest extends BasePage {

    BrowserSelector browserSelector= new BrowserSelector();
    @BeforeMethod
    public void openBrowser()
    {
        browserSelector.selectBrowser();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }
}
