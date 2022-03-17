package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Payment.feature"},
        glue={"src/test/java/Steps/EdHooks.java","src/test/java/Steps/StepdefinitionEd.java"},
        plugin = {"pretty","html:target/cucumber.html"}
        //tags = "@ui"

)



public class EdTestRunner {
}
