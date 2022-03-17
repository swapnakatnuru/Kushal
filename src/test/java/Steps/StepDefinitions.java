package Steps;

import Base.BasePage;
import Utilis.DriverFactory;
import Utilis.DriverFactoryEd;
import Utilis.DriverUtilities;
//import Utilis.ReadTestData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class StepDefinitions {
    @Given("I open browser and I  navigate to  url")
    public void i_open_browser_and_i_navigate_to_url() throws Exception {

        //BasePage.driverUtilities.openBrowser();
        BasePage.driverUtilities.navigateTOUrl();

    }


    @Then("I should be able to navigate to HomePage")
    public void i_should_be_able_to_navigate_to_home_page() {
   String homepagetitle=BasePage.driverUtilities.getPageTitle();
   System.out.println(homepagetitle);

    }
    @When("I click on Gift Cards link")
    public void i_click_on_gift_cards_link() {
        BasePage.homePage.clickGiftCardLink();

    }
    @Then("I should be able to navigate to the GiftCardsPage")
    public void i_should_be_able_to_navigate_to_the_gift_cards_page() {
        String giftcardpage=BasePage.driverUtilities.getPageTitle();
        System.out.println(giftcardpage);

    }
    @When("I click on Register link on Gift Cards Page")
    public void i_click_on_register_link_on_gift_cards_page() {
        BasePage.giftCardsPage.clickRegisterLink();
        String registerpage=BasePage.driverUtilities.getPageTitle();
        System.out.println(registerpage);

    }
    @When("I should be able to select a female button in gender")
    public void i_should_be_able_to_select_a_female_button_in_gender() throws InterruptedException {
        BasePage.giftCardsPage.femaleRadioBtn();
        //Thread.sleep(2000);


    }
    @When("I should be able to enter the following details")
    public void i_should_be_able_to_enter_the_following_details(DataTable data) throws InterruptedException {
        // List<List<String>> obj = data.asLists(String.class);
        //  for(List<String> e : obj) {
        //      BasePage.giftCardsPage.firstNameTxtBox(obj.get(0).get(0));
        //     BasePage.giftCardsPage.lastNameTxtBox(obj.get(0).get(1));
        //     BasePage.giftCardsPage.dateOfBirthDay(obj.get(0).get(2));
        //     BasePage.giftCardsPage.dateOfMonthDrop(obj.get(0).get(3));
        //     BasePage.giftCardsPage.dateOfYearDrop(obj.get(0).get(4));
        //     BasePage.giftCardsPage.enterEmail(obj.get(0).get(5));
        //     BasePage.giftCardsPage.enterCompany(obj.get(0).get(6));
        //      BasePage.giftCardsPage.enterpwd(obj.get(0).get(7));
        //     BasePage.giftCardsPage.enterConPwd(obj.get(0).get(8));
        List<Map<String, String>> obj = data.asMaps(String.class, String.class);
        for (Map<String, String> e : obj) {
            BasePage.giftCardsPage.firstNameTxtBox(obj.get(0).get("FirstName"));
            BasePage.giftCardsPage.lastNameTxtBox(obj.get(0).get("LastName"));
            BasePage.giftCardsPage.dateOfBirthDay(obj.get(0).get("DateOfBirth"));
            BasePage.giftCardsPage.dateOfMonthDrop(obj.get(0).get("DateOfMonth"));
            BasePage.giftCardsPage.dateOfYearDrop(obj.get(0).get("DateOfYear"));
            BasePage.giftCardsPage.enterEmail(obj.get(0).get("Email"));
            BasePage.giftCardsPage.enterCompany(obj.get(0).get("Company"));
            BasePage.giftCardsPage.enterpwd(obj.get(0).get("Password"));
            BasePage.giftCardsPage.enterConPwd(obj.get(0).get("Confirm Password"));
            Thread.sleep(2000);
            BasePage.giftCardsPage.clickRegBtn();
            BasePage.giftCardsPage.clickContine();
            BasePage.driverUtilities.pageRefresh();
            // BasePage.giftCardsPage.clickRegisterLink();

        }
        }
    @Given(": I should enter the url1")
    public void i_should_enter_the_url1() {
    BasePage.driverUtilities.navigateTOUrl1();
    }
    @Then(": I should navigate to the page")
    public void i_should_navigate_to_the_page() {

    }
    }
