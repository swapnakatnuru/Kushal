package Steps;

import Base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepdefinitionEd {
    @Given("I should enter the url1")
    public void i_should_enter_the_url1() {
        BasePage.driverUtilities.navigateTOUrl1();
    }
    @Then("I should navigate to the page")
    public void i_should_navigate_to_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}