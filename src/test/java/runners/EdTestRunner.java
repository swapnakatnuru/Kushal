package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Payment.feature"},
        glue={"EdHooks","StepDefinitions"},
        plugin = {"pretty","html:target/cucumber.html"}
        //tags = "@Parameter"

)



public class EdTestRunner {
}
