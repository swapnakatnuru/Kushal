package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/gift.feature"},
        glue={"Steps"},
        plugin = {"pretty","html:target/cucumber.html"}
        //tags = "@Parameter"

)


public class EdTestRunner {
}
