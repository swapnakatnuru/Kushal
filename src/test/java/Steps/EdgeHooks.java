package Steps;

import Utilis.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class EdgeHooks {

        @Before

        public void setUp()  {

            DriverFactory.getDriverEdge();
        }

        @After
        public void tearD0wn(Scenario scenario) {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            }

            DriverFactory.closeDriver();


        }
}
