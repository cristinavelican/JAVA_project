package features.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;

import java.io.IOException;

public class BookingSteps extends BasePage {

    HomePage homePage = new HomePage();

    public BookingSteps() throws IOException {
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() throws IOException {
        homePage.navigateToHomePage();

    }

    @When("I browse through the page")
    public void i_browse_through_the_page() throws IOException {
        homePage.goToRoomsCategory();
    }
    @Then("I have the option to book a room")
    public void i_have_the_option_to_book_a_room() {
       homePage.assertBookButtonDisplayed();
    }


}
