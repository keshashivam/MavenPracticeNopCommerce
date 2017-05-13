package ComNopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by KAVITA on 10/05/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format = "html:target/CucumberReports",tags = "~@SmokeTest1, @SmokeTest2, @Regression")
public class RunTest {
}
