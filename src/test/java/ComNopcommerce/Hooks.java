package ComNopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

/**
 * Created by KAVITA on 11/05/2017.
 */
public class Hooks extends BasePage {

    BrowserSelector browserSelector= new BrowserSelector();
    @Before
    public void openBrowser()
    {
        browserSelector.selectBrowser();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }
}
