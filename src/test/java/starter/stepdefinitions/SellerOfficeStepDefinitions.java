package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.selleroffice.navigation.loginAndSignup.Login;
import starter.selleroffice.navigation.loginAndSignup.SignUp;
import starter.selleroffice.navigation.pages.sellerOfficeLoginPage;
import starter.selleroffice.navigation.tasks.NavigateTo;


public class SellerOfficeStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the login page")
    public void user_launch_browser_and_open_the_login_page() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.sellerOfficeLoginPage());
    }

    @When("user signed in selleroffice with valid credentials")
    public void user_signed_in_selleroffice_with_valid_credentials() {
        actor.attemptsTo(Login.asNewUser("valid user name", "valid password"));
    }

    @Then("user signed in selleroffice successfully")
    public void user_signed_in_selleroffice_successfully() {
    }

    @When("user navigates to sign up page")
    public void userNavigatesToSignUpPage() {
        actor.attemptsTo(
                Click.on(sellerOfficeLoginPage.SIGN_UP_BTN)
        );
    }

    @And("user fills the required fields but not accept the aggreement")
    public void userFillsTheRequiredFieldsButNotAcceptTheAggreement() {
        actor.attemptsTo(
                SignUp.signUpTheSystem("veli", "velihan2734.", "veli@gmail.co", "delivelibakkal")
        );
    }

    @Then("verify user see an error message displayed")
    public void verifyUserSeeAnErrorMessageDisplayed() {

    }


}
