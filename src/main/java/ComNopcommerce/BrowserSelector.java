package ComNopcommerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by KAVITA on 10/05/2017.
 */
public class BrowserSelector extends Utils {

    LoadProp loadProp = new LoadProp();

    public void selectBrowser()
    {

        String browser = loadProp.getProperty("browser");

        if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver","src/test/Resources/BrowserDriver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/Resources/BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }else {
            System.out.println("Driver name is wrong");
        }
    }
}
