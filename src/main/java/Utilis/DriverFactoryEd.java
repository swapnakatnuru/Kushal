package Utilis;

import Base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Properties;

public class DriverFactoryEd {
    public static WebDriver driver;
    public static Properties prop1;

    public static WebDriver getDriverEdge() {
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        BasePage.initPages();
        return  driver;

    }
    public static void closeDriver() {
        driver.quit();
    }


}
