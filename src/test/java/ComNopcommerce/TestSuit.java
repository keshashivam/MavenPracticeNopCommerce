package ComNopcommerce;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by KAVITA on 10/05/2017.
 */
public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();

    @Test
    public void registrationPage()
    {
        homePage.clickOnRegistration();
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }


}
