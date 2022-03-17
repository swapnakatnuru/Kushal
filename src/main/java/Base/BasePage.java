package Base;

import PageObjects.GiftCardsPage;
import PageObjects.HomePage;
import Utilis.DriverFactory;
import Utilis.DriverUtilities;

import java.util.Properties;

public class BasePage {
    public static HomePage homePage;
    public static GiftCardsPage giftCardsPage;
    public static DriverUtilities driverUtilities;


    public static void initPages() {
        homePage=new HomePage(DriverFactory.driver);
        giftCardsPage=new GiftCardsPage(DriverFactory.driver);
        driverUtilities=new DriverUtilities();


    }

}
