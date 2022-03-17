package runners;

import Utilis.DriverFactory;
import Utilis.DriverUtilities;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue={"Steps"},
        plugin = {"pretty","html:target/cucumber.html"}
        //tags = "@Parameter"
)

public class TestRunner  {

}

