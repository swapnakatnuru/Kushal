package Utilis;

import java.io.FileInputStream;
import java.util.Properties;

public class DriverUtilitiesEd {
    public static Properties prop1;



    public void navigateTOUrl()  {

        prop1 = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/dataEd.properties");
            prop1.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }

        DriverFactory.driver.navigate().to(prop1.getProperty("url"));
    }
    public void navigateTOUrl1()  {

        prop1 = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/dataEd.properties");
            prop1.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }

        DriverFactoryEd.driver.navigate().to(prop1.getProperty("url1"));
    }
    public String getPageTielEd(){
        return  DriverFactoryEd.driver.getTitle();
    }

}
