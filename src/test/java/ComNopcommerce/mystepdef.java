package ComNopcommerce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by KAVITA on 10/05/2017.
 */
public class mystepdef extends Utils {

    HomePage homePage = new HomePage();
    BaseTest baseTest = new BaseTest();

    @Given("^user on home page$")
    public void user_on_home_page()  {

    }

    @When("^click on registration$")
    public void click_on_registration()  {
        homePage.clickOnRegistration();
    }

    @Then("^user should navigate to registration page$")
    public void user_should_navigate_to_registration_page()  {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
        baseTest.closeBrowser();
    }


    @Given("^user on book page$")
    public void user_on_book_page()  {
        homePage.clickOnBook();
    }

    @When("^user click on book$")
    public void user_click_on_book()  {
        driver.findElement(By.linkText("Fahrenheit 451 by Ray Bradbury")).click();
    }

    @Then("^user should navigate to that book$")
    public void user_should_navigate_to_that_book()  {

        Assert.assertTrue(driver.getCurrentUrl().contains("fahrenheit-451-by-ray-bradbury"));
    }

}
