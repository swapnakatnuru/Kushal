package Utilis;

import java.io.FileInputStream;
import java.util.Properties;

public class DriverUtilitiesEd {
    public static Properties prop;



    public void navigateTOUrl()  {

        prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/dataEd.properties");
            prop.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }

        DriverFactory.driver.navigate().to(prop.getProperty("url"));
    }
    public void navigateTOUrl1()  {

        prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/dataEd.properties");
            prop.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }

        DriverFactoryEd.driver.navigate().to(prop.getProperty("url1"));
    }
    public String getPageTielEd(){
        return  DriverFactoryEd.driver.getTitle();
    }

}
