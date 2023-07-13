package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductComparisonSteps {

    @Given("The user must be on the Home page")
    public void theUserMustBeOnTheHomePage() {

    }

    @Given("the user identified {string} as their product of interest")
    public void theUserIdentifiedAsTheirProductOfInterest(String productName) {
    }

    @When("the user hovers over {string} and clicks the Add to Compare button")
    public void theUserHoversOverAndClicksTheAddToCompareButton(String productName) {
    }

    @Then("a confirmation message, {string} should be displayed")
    public void aConfirmationMessageShouldBeDisplayed(String confirmtnMsg) {
    }

    @And("the {string} should be added in the Compare Products screen")
    public void theArgusAllWeatherTankShouldBeAddedInTheCompareProductsScreen(String productName) {
    }

    @When("the user clicks {string} product name")
    public void theUserClicksProductName(String arg0) {
    }

    @And("clicks ADD TO COMPARE link of the product")
    public void clicksADDTOCOMPARELinkOfTheProduct() {
    }
}
