package Steps1;

import Utilis.DriverFactory;
import Utilis.DriverFactoryEd;
import io.cucumber.java.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class EdHooks {
@Before
    public void setup()  {
        DriverFactoryEd.getDriverEdge();}

@After
    public void tearD0wn(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) DriverFactoryEd.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        DriverFactoryEd.closeDriver();
    }
}



