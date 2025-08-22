package StepDefinitions;

import Pages.LoginPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(LoginPageStepDefinitions.class);
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginpage = new LoginPage(driver);

    @Given("User goes to the link")
    public void userGoesToTheLink() {
    }

    @When("User click login button")
    public void userClickLoginButton() {
        loginpage.clickLoginButton();
    }


    @When("The user enters an email address in an incorrect format")
    public void theUserEntersAnEmailAddressInAnIncorrectFormat() {
        loginpage.incorrectMailAddress();
    }

    @Then("An error message appears on the screen")
    public void anErrorMessageAppearsOnTheScreen() {
        loginpage.errorMessage();
    }

    @When("The user enters an true mail address")
    public void theUserEntersAnTrueMailAddress() {
        loginpage.trueMailAddress();
    }

    @When("User click next  button")
    public void userClickNextButton() {
        loginpage.clickNextButton();
    }

    @When("User enters wrong password")
    public void userEntersWrongPassword() {
        loginpage.incorrectPassword();
    }

    @When("User enters true password")
    public void userEntersTruePassword() {
        loginpage.correctPassword();
    }

    @Then("User logs in successfully")
    public void userLogsInSuccessfully() {
        loginpage.SuccessfullLogin();
    }

}
