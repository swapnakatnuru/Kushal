package Base;

import PageObjects.GiftCardsPage;
import PageObjects.GoogleEd;
import PageObjects.HomePage;
import Utilis.DriverFactory;
import Utilis.DriverFactoryEd;
import Utilis.DriverUtilities;
import Utilis.DriverUtilitiesEd;

import java.util.Properties;

public class BasePage {
    public static HomePage homePage;
    public static GiftCardsPage giftCardsPage;
    public static DriverUtilities driverUtilities;
    public static GoogleEd googleEd;
    public static DriverUtilitiesEd driverUtilitiesEd;


    public static void initPages() {
        homePage=new HomePage(DriverFactory.driver);
        giftCardsPage=new GiftCardsPage(DriverFactory.driver);
        driverUtilities=new DriverUtilities();
        googleEd=new GoogleEd(DriverFactoryEd.driver);
        driverUtilitiesEd= new DriverUtilitiesEd();


    }

}
