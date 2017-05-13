package ComNopcommerce;

import org.openqa.selenium.By;

/**
 * Created by KAVITA on 10/05/2017.
 */
public class HomePage extends Utils {

    public void clickOnRegistration()
    {
        driver.findElement(By.className("ico-register")).click();
    }

    public void clickOnBook()
    {
        driver.findElement(By.linkText("Books")).click();
    }

}
